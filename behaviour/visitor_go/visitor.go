package main

import "fmt"


// Visitor interface that define sthe Visit method to be implemented by concrete vistors 
type Visitor interface {
	Visit(Element)
}

/*
	Element interface that defines the Accept method to be implemented by concrete elements
*/
type ConcreteVisitor struct{}
func (self ConcreteVisitor) Visit(el Element) {
	fmt.Println("ConcreteVisitor %s", el)
}