package main

type Iterator interface { 
	Next() interface{}
	HasNext() bool
}

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

}
