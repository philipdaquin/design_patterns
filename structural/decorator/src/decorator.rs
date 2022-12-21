

// The Component trait represents a compoentn that can be decorated 
trait Component { 
    fn operation(&self) -> String;
}

// The ConcreteComponent struct is a concrete implementation of the Component Trait 
struct ConcreteComponent { 
    value: String
}

impl Component for ConcreteComponent { 
    /**
     * The operation method of ConcreteComponent simply returns the value of the value field 
     */
    fn operation(&self) -> String {
        self.value.to_string()
    }
}

/**
 * The Decorator strut is a decorator that wraps a Component
 * and adds additional state to it
 */
struct Decorator<T: Component> { 
    // The component field is a reference to a Component
    component: T,
    
    added_state: String
}

impl<T: Component> Component for Decorator<T> {
    /**
     * The operation method of Decorator returns a string that combines the result of the operation method of the 
     * wrapped Component with the value of the added state field   
     */ 
    fn operation(&self) -> String {
        let value = self.component.operation();

        return format!("{}", value);
    }
}