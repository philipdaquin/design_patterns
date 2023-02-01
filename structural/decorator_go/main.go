package main

func main() { 
	pizza := &VegeMania{}

	pizzaWithCheese := &CheeseTopping {
		topping: pizza,
	}

	pizzaWithCheeseTomato := *&TomatoTopping{
		pizza: pizzaWithCheese,
	}
	print("%s", pizzaWithCheeseTomato)
}