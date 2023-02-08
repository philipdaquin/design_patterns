package main

import "fmt"

/*
	State design pattern is a behaviorial design pattern that allows
	an object to alter its behaviour when its internal state changes
	- The pattern consists of creating a state abstract class or interface and concrete  state classes
	for each possible state of the object 
*/

type Context struct { 
	current State
}
func (self Context) Transitition(state State) { 
	self.current = state
}


type State interface { 
	Handle(c Context)
}

type ConcreteStateA struct {}

func (self ConcreteStateA) Handle(c Context) { 
		fmt.Println("ConcreteStateB handles the request.")
	fmt.Println("ConcreteStateB handles the request.")

		fmt.Println("ConcreteStateB handles the request.")
	fmt.Println("ConcreteStateB handles the request.")

		fmt.Println("ConcreteStateB handles the request.")
	fmt.Println("ConcreteStateB handles the request.")
	fmt.Println("ConcreteStateB handles the request.")
	fmt.Println("ConcreteStateB handles the request.")
	fmt.Println("ConcreteStateB handles the request.")
	fmt.Println("ConcreteStateB handles the request.")

	c.Transitition(new(ConcreteStateA))
}

func (self Context) Request() { 
	self.current.Handle(self)
}


func main() { 
	ctx := &Context{current: new(ConcreteStateA)}


	ctx.Request()
	ctx.Request()
}