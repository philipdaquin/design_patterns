use prototype::Prototype;

use crate::prototype::ConcretePrototype;

/**
 * Protoype is a creational design pattern that allows you to 
 *  create new objects by copying existing ones. It involves 
 *  implmenting a prototype interface that allows you to create a new object 
 *  by calling a clone method on an existing object, rather than a constructor 
 *  to create a new object from scratch
 * 
 * The prototype design pattern is useful when creating a new object expendsive 
 * or time consuming because it allows you to create new objects by copyin existing 
 * ones, rather than creating objects with complex structures or when creating multiple 
 * instances of the same object
 * 
 * 
 */

mod prototype;
fn main() {

    let prototype = ConcretePrototype::new("Hello".to_string());
    let clone = prototype.clone();
        
    println!("Hello, world! {:?}", clone);
}
