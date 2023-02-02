package main

/*
	Command 
	- Is behaviorial design pattern that turns a request into a standalone object that contains all 
	information about the request.
	
	- This transformation lets you pass requests as a method arguments, delay or queue a request's 
	execution, and support undoable operations

	THe pattern consists of 4 main components:
	1. The command interface 
	2. The ConcreteCommadn class
	3. The Receiver class
	4. The Invoker


*/
func main() { 
	receiver := &Receiver{}
	commandA := &ConcreteCommandA{receiver}
	invoke := &Invoker{commandA}

	invoke.call()
}