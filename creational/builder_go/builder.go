package main

// Product struct
type Sandwich struct {
    BreadType  string
    MeatType   string
    Vegetables []string
    Cheese     bool
}

// Builder interface
type SandwichBuilder interface {
    AddBread(breadType string) SandwichBuilder
    AddMeat(meatType string) SandwichBuilder
    AddVegetables(vegetables ...string) SandwichBuilder
    AddCheese() SandwichBuilder
    Build() *Sandwich
}
type ClubSandwichBuilder struct  { 
	sandwish *Sandwich
}
func (self *ClubSandwichBuilder) AddBread(breadType string) SandwichBuilder {
	self.sandwish.BreadType = breadType
	return self 
}

func (self *ClubSandwichBuilder) AddMeat(meatType string) SandwichBuilder { 
	self.sandwish.MeatType = meatType
	return self
} 
func (self *ClubSandwichBuilder) AddVegetables(vegetables ...string) SandwichBuilder { 
	
	curr := self.sandwish.Vegetables
	curr = append(curr, vegetables...)
	return self 
} 
func (self *ClubSandwichBuilder) AddCheese() SandwichBuilder { 
	self.sandwish.Cheese = true
	return self
} 
func (self *ClubSandwichBuilder) Build() *Sandwich { 
	return self.sandwish
} 





	