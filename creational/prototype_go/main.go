package main

import "fmt"

/*
	The prototype desing pattern is a creational design pattern that
	allows for the creation of new objects by copying existing objects, rather than creating
	new objects from scratch

	This pattern uses the concept of cloning to create new objects, which can be more efficient
	than creating new objects from scratch especially for complex objects that take a lot fo resources to reate

*/

type Cloneable interface {
	Clone() Cloneable
}

type Person struct {
	name string
	age  int
	address Address
}
type Address struct { 
	street string
	city string
}


// Clone implements Cloneable
func (self *Person) Clone() Cloneable {
	return &Person{self.name, self.age, self.address}
}
func main() {
	address := &Address {street: "asdasd", city: "asdsdaasd" }
	originalPerson := &Person {name: "cloned data", age: 123, address: *address}

	cloned := originalPerson.Clone()

	fmt.Println(cloned)

}
