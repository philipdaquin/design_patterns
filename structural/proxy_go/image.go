package main

import "fmt"

type Image struct { 
	fileName string
}

func (this *Image) Display() { 
	fmt.Printf("Displaying", this.fileName)

}

type ProxyImage struct { 
	realImage *Image
	fileName string
}

func (this *ProxyImage) Display() { 
	if this.realImage == nil { 
		fmt.Printf("Empty ")
		this.realImage = &Image{fileName: this.fileName}
	}



	this.realImage.Display()


}