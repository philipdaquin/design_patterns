package main

/*
	Adapter
	Allows objects with incompatible interface to collaborate 
*/

// Target interface defines the interface that client expects 
type Target interface { 
	Request() string
}

// adaptee struct holds a specific implementation 
type Adaptee struct {
	sample string
}

func (self *Adaptee) Request() string { 
	return self.sample
}

type Adapter struct { 
	adapter *Adaptee
}

func (self *Adapter) Request() string { 
	return self.Request()
}


func main() { 

	adaptee := &Adaptee{}

	adapter := &Adapter{adaptee}

	println(adapter.Request())
}