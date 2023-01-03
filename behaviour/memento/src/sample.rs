use crate::manager::{Memento, Originator};

#[derive(Debug)]
pub struct MementoA { 
    pub state: String
}

impl Memento for MementoA {
    type State = String;

    fn get_state(&self) -> &Self::State {
        &self.state
    }
}
#[derive(Debug, Clone)]
pub struct OriginatorA { 
    pub state: String
}

impl Originator for OriginatorA {
    type State = String;

    type Memento = MementoA;

    fn create_memento(&self) -> Self::Memento {
        MementoA { 
            state: self.state.clone()
        }
    }

    fn restore(&mut self, memento: Self::Memento) {
        self.state = memento.get_state().clone()
    }
}