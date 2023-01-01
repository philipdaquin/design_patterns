
use std::fmt::Display;
use std::fmt::Debug;
// The common interface for all iterators
trait ProfileIterator {
    fn get_next(&mut self) -> Option<Profile>;
    fn has_more(&self) -> bool;
}

/**
 * The collection interface must declare a factory method for producing 
 * iterators. You can declare serveral methods if there are different 
 * kinds of iterator availble in your program 
 */
trait SocialNetwork { 
    fn create_friends_iterator<'a>(&'a self, profile_id: &'a str) -> Box<dyn ProfileIterator + 'a>;
    fn create_coworkers_iterator<'a>(&'a self, profile_id: &'a str) -> Box<dyn ProfileIterator + 'a>; 
    fn social_graph_request(&self, profile_id: &str, type_: &str) -> Vec<Profile>;

}
#[derive(Clone)]
struct Profile;


struct Facebook;


impl SocialNetwork for Facebook {
    
    fn social_graph_request(&self, profile_id: &str, type_: &str) -> Vec<Profile>  {
        let mut profiles = Vec::new();
        
        profiles 
    }

    /// This indicates that the trait object is bound to the lifetime of the `profile_id`, which means that it is valid 
    /// for as long as the `profile_id` variable is in scope.
    /// 
    /// This ensures that the trait object is valid lifetime of the `profile_id` argument 
    fn create_friends_iterator<'a>(&'a self, profile_id: &'a str) -> Box<dyn ProfileIterator + 'a> {
        Box::new(FacebookIterator::new(self,  profile_id, "friend"))
    }

    fn create_coworkers_iterator<'a>(&'a self, profile_id: &'a str) -> Box<dyn ProfileIterator + 'a> {
        Box::new(FacebookIterator::new(self, profile_id, "friend"))
    }
}

// The concrete iterator class 
struct FacebookIterator<'a> { 
    
    // The iterator needs a reference to the collection that it traverses 
    // 'a specifies the lifetime of the reference to the Facebook object 
    //  TRANSLANTION -> We are referenced to Facebook as long as its alive 
    facebook: &'a Facebook,
    profile_id: &'a str,
    type_: &'a str,

    //  An iterator object traverses the collection independently from other iterators
    //  Therefore it has to store the iteration state 
    current_position: usize,
    cache: Vec<Profile>
}

impl<'a> FacebookIterator<'a> { 
    fn new(facebook: &'a Facebook, profile_id: &'a str, type_: &'a str) -> Self { 
        Self { 
            // The lifetime of the reference is set to be the same as the lifetime of the object 
            facebook, 
            profile_id,
            type_,
            current_position: 0,
            cache: Vec::new()
        }
    }
    fn lazy_init(&mut self) { 
        if self.cache.is_empty() { 
           self.cache = self.facebook.social_graph_request(self.profile_id, self.type_)
        }
    }
    
}

impl<'a> ProfileIterator for FacebookIterator<'a> {
    /// If there are more profiles in the cache, return the current profile 
    /// Increment the current position. Otherwise return None
    fn get_next(&mut self) -> Option<Profile> {
        if self.has_more() { 
            let mut num = self.current_position;

            num +=1;

            return Some(self.cache[self.current_position - 1].clone())
            
        } 
        None
        
    }
    /// Returns true if the current position is less than the length of the cache 
    fn has_more(&self) -> bool {
        self.current_position < self.cache.len()
    }
}

struct SocialSpammer;

impl SocialSpammer { 
    fn send(&self, iterator: &mut dyn ProfileIterator, message: &str) { 
        while iterator.has_more() { 
            if let Some(profile) = iterator.get_next() { 
                todo!()
            }
        }
    }


    /**
     * 
     * Sample code to be more familiar with Rust Traits 
     * 
     */

    fn send_another(social: &(impl SocialNetwork + Display)) { 
        todo!()
    }
    fn notify<T: SocialNetwork + Display>(social: &T) { 
        todo!()
    }

    fn some_function<T, U>(t: &T, u: &U) -> i32 
        where T: Display + Clone, 
            U: Clone + Debug 
    {
            todo!()
    }

    fn return_social_type() -> impl SocialNetwork { 
        // Facebook implements SocialNetwork Trait
        Facebook
    }

    /// Sized: is used to at a type with known compile time 
    /// T may or may not be Sized 
    /// Because the type might not be Sized we need to use it behind some kind of 
    /// pointer
    fn advance_type<T: ?Sized>(new_type: &T) { 
        todo!()
    }


}

struct Application {
    network: Box<dyn SocialNetwork>,
    spammer: SocialSpammer
}

impl Application { 
    fn config(&mut self) { 
        self.network = Box::new( Facebook);
        self.spammer = SocialSpammer
    }
}