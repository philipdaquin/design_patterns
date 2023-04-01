package main 
import "fmt"

/*
	Flyweight pattern
	- Aims to reduce the memory footprint of an application by sharing as mcuh data as possible 
		between objects,
	
	- The main idea behind the flyweight pattern is to create a set of lightweight objects that can
		the reused across the application, rather than creating new objects every time they are needed 
	
	- The Flyweight pattern is particularly useful in situations where an applications need to create a large 
		number of similar objects, such as in graphical user interface or a computer game 
	
	The Flyweight pattern, the application can reduice its memory usage and improve performance, since it no longer needs to create and 
	store a separate object for each instance 

	Overall, the Flyweight pattern is a useful technique for improving the performance and efficiency of an application,
	particularly in situations where large numbers of objects need to be created and manipulated 
	
*/


/*
	Flyweight represents a shared object that can be used by multiple other 
	objects to avoid unnecessary duplication of data
*/
type Flyweight struct { 
	key string
}

// Operation performs some operation using the flyweight object 
func (self *Flyweight) Operation() { 
	fmt.Println("Perforing operation using flyweight %s\n", self.key)
}


/*
	Factory manages flyweight objects and ensures that only one instance of each flyweight is created and reused 

*/
type FlyweightFactory struct { 
	flyweight map[string]*Flyweight
}

func NewFlyweightFactory() *FlyweightFactory { 
	return &FlyweightFactory{flyweight: make(map[string]*Flyweight)}
}


/*
	Return the current instance of Flyweight with the associated key 
	If no flyweight exists for the given key, a new one is created and returned
*/
func (self *FlyweightFactory) GetFlyweight(key string) *Flyweight { 
	
	// Check for the current instance 
	if flyweight, ok := self.flyweight[key]; ok {
		return flyweight
	}

	// Else, add the new key to the map
	newFlyweight := &Flyweight{key: key}
	self.flyweight[key] = newFlyweight
	
	return newFlyweight
}


func main() { 
	// Initialise factory
	factory := NewFlyweightFactory()
	
	kv := factory.GetFlyweight("test")
	kv2 := factory.GetFlyweight("test2")
	kv3 := factory.GetFlyweight("test3")
	kv4 := factory.GetFlyweight("test3")

	// Use the flyweights to perform operations 
	kv.Operation()
	kv2.Operation()
	kv3.Operation()
	kv4.Operation()
}