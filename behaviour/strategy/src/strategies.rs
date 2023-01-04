use std::{cell::RefCell, rc::Rc};


// The strategy interface declares operations common to all
// supported versions of some algorithm. The context uses this
// interface to call the algorithm defined by the concrete
// strategies.
pub trait Strategy { 
    fn execute(&self);
}

// Concrete strategies implement the algorithm while following
// the base strategy interface. The interface makes them
// interchangeable in the context.
pub struct StrategyA<'a> { 
    pub data: &'a str
}
impl<'a> Strategy for StrategyA<'a> { 
    fn execute(&self) {
        println!("strategy A")
    }
}

/// The Context maintains a reference to one of the concrete strategies and communicates
/// with this object only via the strategy interface 
pub struct Context<T: Strategy> { 
    // The Context maintains a refecne to one of the strategy objects
    // The context doesnt know the concrete clas of a strategy. It should 
    // work with all strategies via the strategy interface
    pub strategy: Rc<RefCell<T>>
}

impl<T: Strategy> Context<T> { 
    // Usually the context accepts a strategy through the constructor, and also 
    // provides a setter so that the strategy can be switched at runtime 
    pub fn new(strategy: Rc<RefCell<T>>) -> Context<T> { 
        Self { 
            strategy
        }
    }

    // The context delegates some work to the strategy objets
    // instead of implementing multiplle multiple versions of the algorithm on its own 
    pub fn execute_strategy(&self) { 
        self.strategy.borrow().execute()
    }
}

