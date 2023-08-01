
/*
    Abstract Factory Pattern 
    - An interface for creating families of related or dependent objects without 
    specifying their concrete classes

    - It allows you to create objects that follow a certain interface or theme while hiding the 
    implementation detials of how those objects are created 


*/

class PizzaStore { 
    private PizzaFactory factory;
    public PizzaStore(PizzaFactory newFactory) { 
        this.factory = newFactory;
    }
    public void OrderPizza() { 
        var pizza = factory.CreateIndian();
        pizza.Prepare();
        pizza.Bake();
        pizza.Cut();
        pizza.Box();
    }
}


namespace Abstract { 
    class Program { 
        static void Main() { 
            var factory = new NycFactory();
            var store = new PizzaStore(factory);
            store.OrderPizza();
        }
    }
}