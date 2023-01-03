pub trait Memento { 
    type State;

    fn get_state(&self) -> &Self::State;
}

pub trait Originator { 
    type State;
    type Memento: Memento<State = Self::State>;

    fn create_memento(&self) -> Self::Memento;
    fn restore(&mut self, memento: Self::Memento);
}

///     We need to ensure that the `Originator` is not dropped while 
///     the  `CareTaker` still holds a reference to it 
/// 
///     By adding the lifetime to the `Originator` type parameter, we can ensure the 
///     `Caretaker`'s reference to `Originator` is only valid as long as the 
///     `Caretaker` doesnt go out of scope
#[derive(Debug)]
pub struct Caretaker<'a, O: Originator + 'a> { 
    pub originator: &'a mut O,
    memento: Option<O::Memento>
}

impl<'a, O: Originator + 'a> Caretaker<'a, O> { 

    pub fn new(originator: &'a mut O) -> Caretaker<'a, O> { 
        Self { 
            originator, 
            memento: None
        }
    }

    pub fn save(&mut self) { 
        self.memento = Some(self.originator.create_memento());
    }

    pub fn restore(&mut self) { 
        if let Some(memento) = self.memento.take() { 
            self.originator.restore(memento)
        }
    }
}
pub struct UndoManager<'a, O: Originator + 'a> { 
    pub caretakers: Vec<Caretaker<'a, O>>
}

impl<'a, O: Originator + 'a> UndoManager<'a, O> {

    pub fn new(originator: &'a mut O) -> Self { 
        let mut caretakers = vec![];

        caretakers.push(Caretaker::new(originator));
        
        Self {  caretakers  }
    }
    pub fn save_state(&mut self, originator: &'a mut O) { 
        self.caretakers.push(Caretaker::new(originator))
    }
    pub fn undo(&mut self) { 
        if let Some(mut caretaker) = self.caretakers.pop() { 
            caretaker.restore();
        }
    }
}
