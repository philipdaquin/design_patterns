package main

import  "fmt"


/*
	Factor Design Pattern is a creational design pattern that provides na interface for creating 
	objects in a super class, but allows subclasses to alter the type of objects that will be created

	It is a way to create object without specifyng the exact class of object that will be created

*/

// Product interface defines the interface for all products 
type Product interface { 
	use() 
}

// Objects struct inmplements the Product Interface 
type ConcreteProductA struct {}
type ConcreteProductB struct {}

func (self ConcreteProductA) use() { 
	fmt.Println("Using Concrete Product A")
}

func (self ConcreteProductB) use() { 
	fmt.Println("Using Concrete Product B")
}

// Creator interface defines the interface for all creators 
type Creator interface { 
	createProduct() Product 
}

// Factor to create to 
type CreatorA struct {}
type CreatorB struct {}

func (self CreatorA) createProduct() Product { 
	return ConcreteProductA{}
}
func (self CreatorB) createProduct() Product {
	return ConcreteProductB{}
}

func main() { 
	// Initialise the factor
	var creator Creator

	creator = CreatorA{}
	// Create a product using the factory method 
	product := creator.createProduct()
	
	product.use()

}