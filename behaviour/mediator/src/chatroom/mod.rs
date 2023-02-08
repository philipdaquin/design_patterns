use std::collections::HashMap;

trait Mediator {
    fn register(&mut self, colleague: T) where T: Colleague; 
    fn send(&self, sender: &str, message: &str, recipient: Option<&str>);
}

trait Colleague { 
    fn new(name: &str, mediator: Box<dyn Mediator>) -> Self where Self: Sized;
    fn get_name(&self) -> &str;
    fn send(&self, message: &str, recipient: Option<&str>);
    fn receive(&self, sender: &str, message: &str);
}

struct ChatRoom { 
    users: HashMap<String, Box<dyn Colleague>>
}


impl Mediator for ChatRoom {
    fn register(&mut self, colleague: Box<dyn Colleague>) {
        self.users.insert(colleague.get_name().to_string(), colleague);
    }

    fn send(&self, sender: &str, message: &str, recipient: Option<&str>) {
        
        if let Some(recipient) = recipient { 
            self.users[recipient].receive(sender, message)
        } else { 
            for (_, user) in &self.users { 
                if user.get_name() != sender { 
                    user.receive(sender, message)
                }
            }
        }
    }
}
#[derive(Clone)]
struct User { 
    name: String, 
    mediator: Box<dyn Mediator>
}

impl Colleague for User {
    fn new(name: &str, mut mediator: Box<dyn Mediator>) -> Self where Self: Sized {


        mediator.register(Box::new(User { 
            name: name.to_string(),
            mediator: mediator
        }));

        User { 
            name: name.to_string(),
            mediator
        }
    }

    fn get_name(&self) -> &str {
        todo!()
    }

    fn send(&self, message: &str, recipient: Option<&str>) {
        todo!()
    }

    fn receive(&self, sender: &str, message: &str) {
        println!("{} sent a message to {}: {}", sender, self.name, message);
    }
}
