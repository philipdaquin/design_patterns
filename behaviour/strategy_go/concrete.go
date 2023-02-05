package main

type ConcreteMediator struct { 
	colleague []Colleague
}

func (self ConcreteMediator) Send(message string, sender Colleague) {
	for _, colleague := range self.colleague {
		if colleague != sender { 
			colleague.Notify(message)
		}
	}
}


type ConcreteColleague struct { 
	mediator Mediator
	name string
}

func (self ConcreteColleague) Notify(message string) {
	println("%s %s", self.name, message)
}

