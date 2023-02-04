package main


// Memento interface defines the contract for the memento objects
type Memento interface { 
	GetState() string
}

type ConcreteMemento struct { 
	state string
}

func (self ConcreteMemento) GetState() string { 
	return self.state
}