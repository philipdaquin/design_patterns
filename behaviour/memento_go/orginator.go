package main


type Originator interface { 
	SetState(state string)
	CreateMemento() Memento
	RestoreMemento(memento Memento)
	GetState() string
}

type ConcreteOrignator struct { 
	state string
}

func (self ConcreteOrignator) SetState(state string) {
	self.state = state
}

func (self ConcreteOrignator) CreateMemento() Memento {
	return &ConcreteMemento{state: self.state}
}

func (self ConcreteOrignator) RestoreMemento(memento Memento) {
	self.state = memento.GetState()
}

func (self ConcreteOrignator) 	GetState() string {
	return self.state
}
