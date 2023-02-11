package main

/*
	Element interface that deifnes the Accept method to be implemented 
	by concrete elements
*/
type Element interface { 
	Accept(Visitor)
}


type ConcreteElementA struct {}

func (self ConcreteElementA) Accept(v Visitor) { 
	v.Visit(self)
}

