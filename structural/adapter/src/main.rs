

/**
 * Adapter 
 * 
 * This is a specifal object that convers the interface of one object so that 
 * another object can understand it 
 * - it does this by converting the interface of one clas into an interface that the client
 *  expects. The Adapter class allows the client to use the adapted class as if it had the 
 *  original interface
 * 
 * 
 * An adapter wraps one of the objets to hide the complexity of conversion happenign 
 * behind the scenes. 
 * 
 * 
 * 1. Adapter gets an interface, compatible with one of the existing objects
 * 2. Using this interface, the existing object can safely call the adapter's methods
 * 3. Upon receiving a call, a adapter passes the request to the second object, but in a format
 *    and order that the second object expects 
 * 
 */


// The target trait that client expects
trait Target { 
    fn request(&self);
}


/**
 * The adaptee struct that has the functionality the client needs
 * but with a different interface 
 */

trait AdapteeInterface { 
    fn specific_request(&self);
}
 #[derive(Default)]
struct Adaptee;
impl AdapteeInterface for Adaptee {
    // Implementation of the specific request
    fn specific_request(&self) {
        println!("Specific request made");
    }
}

/**
 * The Adapter struct that converts the adaptee's interface into the target trait
 */
struct Adapter<T: AdapteeInterface> { 
    adaptee: T
} 

impl<T> Adapter<T> where T: AdapteeInterface { 
    fn new(adaptee: T) -> Self { 
        Self { 
            adaptee
        }
    }
}

impl Target for Adapter<Adaptee> { 
    fn request(&self) {
        // Convert the request to the specific request and invoke it 
        self.adaptee.specific_request();
    }
}


///  
/// The {@code Target} field is smart pointer to a value of any type that 
/// implements the {@code Target} trait, stored on the heap.
///  
/// This allows the {@code Client} struct to use a value of any type that 
/// implements @{code Target} trait as the {@code target}
///  
struct Client { 
    // Store dynamically stize type in a data struct that expects a fixed type
    target: Box<dyn Target>
}

impl Client { 
    fn new(target: Box<dyn Target>) -> Self { 
        Self { 
            target
        }
    }
    fn invoke_target_request(&self) { 
        self.target.request();
    }
}




fn main() {

    // Create an instance of the adaptee 
    let adaptee: Adaptee = Adaptee::default();

    // Create an instance of the Adapter, passing in the adaptee
    let target = Adapter::new(adaptee);

    // Create an instance of the clinet, passing in the target trait object
    let client = Client::new(Box::new(target));

    // Invoke the main method of the client 
    client.invoke_target_request();

    println!("Hello, world!");
}
