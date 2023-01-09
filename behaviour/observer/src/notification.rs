use std::{fmt::Debug, hash::Hash, rc::Rc, cell::RefCell};
/// Objects that are interested in receiving notifications from the subjects
/// when the subject's state changes. 
/// 
/// - They register their interest with the subject, and the subject sends them 
///     notifications when necessary  
trait Subscriber<T> 
    where T: Debug + Eq + PartialEq + Clone  { 
    fn update(&mut self, subject: T);
}

/// Subscriber os used to store the list of observer objects 
type SubscriberList<T> = Vec<Box<dyn Subscriber<T>>>;

/// The base publisher class includes subscription management 
/// code and notification methods 
trait Publisher<T> 
    where T: Debug + Eq + PartialEq + Clone { 
    fn subscribe(&mut self, subscriber: Box<dyn Subscriber<T>>);
    fn unsubscribe(&mut self, subscriber: Box<dyn Subscriber<T>>);
    fn notify(&mut self);
}

struct EventManager<T> 
    where T: Debug + Eq + PartialEq + Clone  { 

    state: T,
    listeners: SubscriberList<T>
}

impl<T> PartialEq for dyn Subscriber<T>   {
    fn eq(&self, other: &Self) -> bool {
        self == other    
    }

    fn ne(&self, other: &Self) -> bool {
        !self.eq(other)
    }
} 


impl<T> EventManager<T> 
    where T: Debug + Eq + PartialEq + Clone  {  

    fn new(initial_state: T) -> Self { 
        Self { 
            state: initial_state,
            listeners: SubscriberList::new()
        }
    }
}


impl<T> Publisher<T> for EventManager<T> 
    where T: Debug + Eq + PartialEq + Clone {

    fn subscribe(&mut self, subscriber: Box<dyn Subscriber<T>>) {
        self.listeners.push(subscriber)
    }

    fn unsubscribe(&mut self, observer: Box<dyn Subscriber<T>>) {
        let index = self.listeners
            .iter()
            .position(|o| o.as_ref() == observer.as_ref());
        
        if let Some(index) = index {
            self.listeners.remove(index);
        }
    }
    

    fn notify(&mut self) {
        for o in &mut self.listeners { 
            o.update(self.state.clone())
        }
    }
}


type Subject<T> = Rc<RefCell<EventManager<T>>>;

struct EventSubscriber<T> 
    where T: Debug + Eq + PartialEq + Clone  { 
    subject: Subject<T>,
    value: T
}

impl<T> EventSubscriber<T> 
    where T: Debug + Eq + PartialEq + Clone { 
    
    fn new(subject: Subject<T>, value: T) -> Self { 
        Self { 
            subject,
            value
        }
    }
}

impl<T> Subscriber<T> for EventSubscriber<T> 
    where T: Debug + Eq + PartialEq + Clone  {
    
    fn update(&mut self, subject: T) {
        self.value = subject.clone()
    }
}
