package main

import "fmt"

type Iterator interface { 
	Next() interface{}
	HasNext() bool
}
/*
	ConcreteIterator implements the Iterator interface and provides the mehtods
	to traverse the elements of a ConcreteAggregate object
	
	The ConcreteAggregate implements the Aggregate interface an provides a method 
	to return an iterator for its elements

*/
type ConcreteIterator struct { 
	items []interface{}
	index int
}

func (i *ConcreteIterator) HasNext() bool { 
	if i.index < len(i.items) { 
		return true
	}
	return false
}
func (i *ConcreteIterator) Next() interface{} { 
	if i.HasNext() { 
		item := i.items[i.index]
		i.index +=1
		return item
		
	}
	return nil
}
type Aggregate interface { 
	Iterator() Iterator
}

type ConcreteAggregate struct {
	items []interface{}
}

func (i *ConcreteAggregate) Iterator() Iterator { 
	return &ConcreteIterator {i.items, 0 }
}

func main() { 
	items := &ConcreteAggregate{[]interface{}{ 1, 2,3,4,5,6,7,8}}
	iterator := items.Iterator()

	for iterator.HasNext() { 
		fmt.Println(iterator.Next())
	}

}
