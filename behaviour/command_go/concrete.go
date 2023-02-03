package main




type ConcreteCommandA struct { 
	receiver *Receiver
}

func (self *ConcreteCommandA) actionA() {
	
	self.receiver.actionA()
} 

func (self *ConcreteCommandA) actionB() {
	self.receiver.actionB()
} 