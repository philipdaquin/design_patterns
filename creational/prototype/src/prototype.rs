use std::fmt::Debug;



pub trait Prototype: Debug { 
    // Method that creates a new object by copying an existing one
    fn clone(&self) -> Box<dyn Prototype>;
}


// Concrete Prototype
// This struct represents the object that we want to copy 
#[derive(Debug)]
pub struct ConcretePrototype { 
    field: String
}

impl ConcretePrototype { 
    pub fn new(field: String) -> Self { 
        Self { 
            field
        }
    }
}

impl Prototype for ConcretePrototype { 
    fn clone(&self) -> Box<dyn Prototype> {
        Box::new(ConcretePrototype::new(self.field.clone()))
    }
}


