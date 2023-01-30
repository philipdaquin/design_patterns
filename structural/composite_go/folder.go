package main

import (
	"fmt"
)

type Folder struct { 
	components []Component
	name string
}

func (self *Folder) search(keyword string) { 
	fmt.Printf("Searching recursively for key %s in folder %s\n", keyword, self.name)
	for _, comp := range self.components { 
		comp.search(keyword)
	}
}

func (self *Folder) add(component Component)  {
	self.components = append(self.components, component)
}