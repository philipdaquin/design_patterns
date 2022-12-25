use crate::shape::{CircleShape, DrawingApi1};

/**
 *  Bridge 
 *      Is a structural design pattern that lets you split a large class 
 *   or a set of closely related classes into two separate heiracrchie -- abstraction 
 *   and implemnetation -- which can be developerd independently of each other 
 *  
 *  The pattern involves creating a bridge interface with a method for each 
 *  implementation and then implementing the interface in conrete classes
 * 
 * 
 *  The bridge design pattern is used to: 
 *  - Decouple an abstraction from its implementation so that the two can vary independently 
 *  - Share an implementation among multiple objects
 *  - Improve the extensibility of a class hierarchy by decoupling the abstraction from 
 *    the implementation and allowing them to evolve independently
 * 
 */
mod shape;

fn main() {
    let drawing = Box::new(DrawingApi1);
    let mut circle = CircleShape::new(1.2, 2.4, 29.2, drawing);

    println!("Hello, world!");
}
