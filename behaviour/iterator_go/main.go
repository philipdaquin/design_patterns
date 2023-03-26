package main
import "fmt"
type Iterator interface { 
	Next() interface{}
	HasNext() bool
}

type Container interface { 
	GetIterator() Iterator
}

type ConcreteIterator struct { 
	index int
	data []interface{}
}

func (self *ConcreteIterator) Next() interface {} { 
	value := self.data[self.index]
	self.index +=1
	return value
}

func (self *ConcreteIterator) HasNext() bool { 
	// if self.index > len(self.data) { 
	// 	return true
	// }
	// return false
	return self.index < len(self.data)
}

type MContainer struct { 
	data []interface {}
}

func (self *MContainer) GetIterator() Iterator { 
	return &ConcreteIterator{0, self.data}
}

func main() {  
	container := MContainer{[]interface{}{"", "", ""}}
	iter := container.GetIterator()
	for iter.HasNext() { 
		fmt.Println(iter.Next())
	}
}