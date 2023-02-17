use std::collections::HashMap;

trait Mediator {
    fn register(&mut self, colleague: User);
    fn send(&self, sender: &str, message: &str, recipient: Option<&str>);
}

trait Colleague { 
    fn new(name: &str, mediator: ChatRoom) -> Self where Self: Sized;
    fn get_name(&self) -> &str;
    fn send(&self, message: &str, recipient: Option<&str>);
    fn receive(&self, sender: &str, message: &str);
}

#[derive(Default, Clone)]
struct ChatRoom { 
    users: HashMap<String, User>
}


impl Mediator for ChatRoom {
    // fn register(&mut self, colleague: C) {
    //     self.users.insert(colleague.get_name().to_string(), colleague);
    // }

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

    fn register(&mut self, colleague: User) {
        self.users.insert(colleague.get_name().to_string(), colleague);

    }
}
#[derive(Clone)]
struct User { 
    name: String, 
    mediator: ChatRoom
}

impl Colleague for User  {
    fn new(name: &str, mut mediator: ChatRoom) -> Self where Self: Sized {
        let mut chatroom = ChatRoom::default();

        mediator.register(User { 
            name: name.to_string(),
            mediator: mediator.clone()
        });
        
        User { 
            name: name.to_string(),
            mediator: chatroom
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
