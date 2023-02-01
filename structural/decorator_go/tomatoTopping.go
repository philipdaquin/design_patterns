package main

type TomatoTopping struct { 
	pizza Pizza
}

func (self TomatoTopping) getPrice() int { 
	return self.pizza.getPrice()
	
}