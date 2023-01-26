package main

/*
	The Proxy Pattern is a structural design pattern taht provides a surrogate or placeholder object
	for another object, which controls access to it.
	This can be useful in situations where a control layer is required between the object being accessed and the code accessing it 
*/

func main() { 
	image := &ProxyImage {fileName: "Test"}
	image1 := &ProxyImage {}

	image.Display()


	image1.Display()
}