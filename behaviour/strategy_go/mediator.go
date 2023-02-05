package main

// Mediator defines an interface for communicating with colleague objects
type Mediator interface { 
	Send(message string, sender Colleague)
}