package main 

type Invoker struct { 
	command Command
}

func (self *Invoker) call() { 
	self.command.execute()
}