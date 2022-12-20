

// The base component that can be altered by decorators
mod decorator;
use std::rc::Rc;

#[derive(Debug)]
struct CoffeeObject { 
    description: String
}

trait Coffee {
    fn get_description(&self) -> String;
}

impl Coffee for CoffeeObject { 
    fn get_description(&self) -> String {
        self.description.to_string()
    }
}


trait CoffeDecorator {
    fn new(coffee: Rc<dyn Coffee>) -> Self;
}


struct MilkObject {
    coffee: Rc<dyn Coffee>
}
impl CoffeDecorator for MilkObject { 
    fn new(coffee: Rc<dyn Coffee>) -> Self {
        MilkObject { coffee }
    }
}

impl Coffee for MilkObject { 
    fn get_description(&self) -> String {
        format!("Included object to the coffee is: {}", self.coffee.get_description())
    }
}


struct Client;

impl Client { 
    fn print_client<T: Coffee>(coffee: &T) { 
        println!("result: {}", coffee.get_description())
    }
}




fn main() {

    let coffee = Rc::new(CoffeeObject {
        description: "LOL".to_string()});
    Client::print_client(coffee.as_ref());

    let milk = MilkObject::new(coffee.clone());
    Client::print_client(&milk);
    println!("Hello, world! {:#?}", coffee.clone());
}
