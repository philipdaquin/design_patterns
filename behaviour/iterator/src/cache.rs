use std::{fmt::{Debug}, hash::Hash};

/**
 *  `EQ`: That defines the eqaulity operator (`==`) for a type 
 *  `Hash`: Generates a hash value for a type . It is uused by the 
 *          Hashmap to store and retrieve values efficiently
 *  `Debug`:Used to format a value as a string for debugging purposes     
 * 
 * 
 *      The 'a lifetime is used in the `Cache` trait and the `InMemoryCache` struct
 *      to indicate that the refences in the `get` method and the `cache` field are 
 *      valid for at least as long as the lifetime `a
 *      
 *      This is necessary because the `get` method return a refernece to a value in the `cache` 
 *      field. 
 *          -   If the reference did not have a lifetime associated with it, it would be unclear 
 *              how long the reference would be valid for 
 *              
 *              By specifying the lifetime `a we ensure that the reference is only valid for as long 
 *              as the `InMemoryCache` struct is alive 
 *     
 *          - This is important for ensuring the safety of the code. If a reference were 
 *            returned that referred to data that had been deallocated, it would be a dangling referenec 
 */

trait Cache<'a, K, V> 
    where V: Debug + Clone, 
          K: Debug + Hash + Eq + PartialOrd + PartialEq + Clone {
    fn get(&'a mut self, key: &K) -> Option<&'a V>;
    fn put(&'a mut self, key: K, value: V);
}


struct InMemoryCache<'a, K, V> 
    where 
        V: Debug + Clone, 
        K: Debug + Hash + Eq + PartialOrd + PartialEq  {

    cache: &'a mut Vec<(K, V)>
}

impl<'a, K, V> Cache<'a, K, V> for InMemoryCache<'a, K, V> 
    where V: Debug + Clone, 
          K: Debug + Hash + Eq + PartialOrd + PartialEq + Clone {
    
    fn get(&'a mut self, key: &K) -> Option<&'a V> {

        for (k , v) in self.cache.iter() { 
            if *k == *key { 
                return Some(&v)
            }
        }
        None

    }

    fn put(&mut self, key: K, value: V) {
        self.cache.push((key, value));
    }
}


struct CachedValue<'a, V, K, C> 
    where 
        V: Debug + Clone, 
        K: Debug + Hash + Eq + PartialOrd + PartialEq + Clone, 
        C: Cache<'a, K, V>,   {
    
    key: K,
    value: Option<V>,

    // The type 'C' must implement the 'Cache' trait for the lifetime 'a and the 
    // types K and V. This allows us to use the CachedValue struct with any type of Cache
    // that is able to store values of type V with keys of type K
    cache: &'a mut C
}

impl<'a, V, K, C> CachedValue<'a, V, K, C> 
    where 
        V: Debug + Clone, 
        K: Debug + Hash + Eq + PartialOrd + PartialEq + Clone, 
        C: Cache<'a, K, V> {
    
    fn new(cache: &'a mut C, key: K) -> Self { 
        Self { 
            key,
            value: None,
            cache
        }
    }

    ///
    /// The methods uses the `get` method of the `Cached` trait to look up the value in the cache
    /// * If the value is present in the cached, it is cloned and returned
    /// * If the value is not present, the key and value are both added to the Cache
    ///     - This hides the details of cache management from the client
    ///     - this allows the client to simply request the value from the cache, without having to worry 
    ///       about whether the value is preent in the cache or whether it needs to be added to the cache
    ///     - By adding automatically adding missing values to the cache, we can ensure that the value is only computed once
    /// 
    /// 
    /// Since we are already in referenced with CachedValue, and we want to reference `key` value, then
    /// we need to explicity state the lifetime of this reference
    ///  
    /// - `'b` specifies the lifetime for the argument `key` which is a reference to the value of key 
    /// - we needed a reference to the value of `key` to access the CachedValue  
    ///      ie. fn getValue(&mut self, key &K) -> Option<&V>
    /// 
    /// - This means that the value being referecened must live at least as long as the lifetime `a
    fn get_value<'b>(&'a mut self, key: &'b K) -> Option<&V> { 

        match *key { 
            ref key if key == &self.key => { 
                
                let insert_val = self.value.as_ref().unwrap().clone();

                self.cache.put(key.to_owned(), insert_val);

                self.value.as_ref()
            }   
            _ => None
        }
    }
}
