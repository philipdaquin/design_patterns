package main

type CheeseTopping struct { 
	topping Pizza
}

func (self CheeseTopping) getPrice() int { 
	price := self.topping.getPrice()
	return price + 10
}