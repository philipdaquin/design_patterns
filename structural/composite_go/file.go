package main

import "fmt"

type File struct {
	name string
}

func (self *File) search(keyword string) { 
	fmt.Printf("Searching %s", keyword)
}

func (self *File) getName() string { 
	return self.name
}