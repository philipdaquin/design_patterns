package main

// The director: Class that uses the builder to create the product 

type SandwichMaker struct { 
	builder SandwichBuilder
}

func (self *SandwichMaker) SetBuilder(builder SandwichBuilder) { 
	self.builder = builder 
}

func (self *SandwichMaker) MakeSandwich() *Sandwich {
	return self.builder.AddBread("White").AddMeat("").AddVegetables("", "").AddCheese().Build()
}