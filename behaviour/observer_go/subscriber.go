package main


type Subscriber interface {
	Update(k, v string)
}

type ConcreteSubscriber struct {}

func (self ConcreteSubscriber) Update(k, v string) { 
	
}