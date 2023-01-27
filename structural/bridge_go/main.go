package main

/*
	Bridge

	- is a structural desing pattern that lets you split a large class or a set of closely 
	related classes into two separated hierarchies -- abstraction and implementation -- 
	which can be developed independently of each other 

	The pattern can be implemented using an interface and structs that implement that interface,
	where the structs encapsulates the implementation details 
*/


type Drawer interface { 
	DrawCircle(x, y, radius float64)
}

type ConcreteImplementationA struct {}

func (self ConcreteImplementationA) DrawCircle(x, y, radius float64) { 
	println("A x : {&x}, y :  {&y}, radius: {&radius}")
}

type ConcreteImplementationB struct {}

func (self ConcreteImplementationB) DrawCircle(x, y, radius float64) { 
	println("B x : {x}, y :  {y}, radius: {radius}")
}

type Shape struct { 
	drawer Drawer
}

func (self *Shape) DrawCircle(x, y, radius float64) {
	self.drawer.DrawCircle(x, y, radius)
}

func main() { 
	shapeA := &Shape{&ConcreteImplementationA{}}
	shapeA.DrawCircle(1, 2, 4)
}