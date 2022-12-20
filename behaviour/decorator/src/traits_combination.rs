
/**
 * You can use trait inheritance to define a trait that derives from one or more other traits. 
 * This allows you to reuse the methods and types of the parent traits in your new trait. 
 * For example:
 */

trait A {  fn a(&self); }
trait B {  fn b(&self); }

trait C: A + B {  fn c(&self); }

pub struct D;


pub struct K;

impl A for K { 
    fn a(&self) {
        println!("A!");
    }
}
impl B for K { 
    fn b(&self) {
        println!("B!");
    }
}



impl A for D { 
    fn a(&self) {
        println!("A!");
    }
}

impl B for D { 
    fn b(&self) {
        println!("D");
    }
}

impl C for D { 
    fn c(&self) {
        println!("C")
    }
}


/**
 * You can use the + operator to specify that a type implements multiple traits. 
 * This can be useful when you want to specify that a type implements a set of related traits, 
 * or when you want to "mix in" the methods of multiple traits into a single type. For example:
 */
pub fn call_functions() { 

    let k: &dyn A  = &K;


    let c = &D;
    c.a();
    c.b();
    c.c();
}