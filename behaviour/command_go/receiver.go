package main



type Receiver struct {}

func (self *Receiver) actionA() {
	println("Receiver performs action A")
} 

func (self *Receiver) actionB() {
	println("Receiver performs action B")
} 