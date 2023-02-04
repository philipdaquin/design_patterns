package main

/*
	Caretakers 
	the object that saves and restores the originator's state
*/
type CareTaker struct { 
	mementos []Memento
}


func (self CareTaker) AddMemento(memento Memento) { 
	self.mementos = append(self.mementos, memento)
}

func (self CareTaker) GetMemento(index int) Memento { 
	if index >= 0 && index < len(self.mementos) {
		return self.mementos[index]
	}	
	return nil
}