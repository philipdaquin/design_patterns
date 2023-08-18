
using System;


/*
    Decorator Design Pattern 
    - Structural design pattern that allows you to dynamically add behaviour or
    responsibilities to objects without altering their existing code.
    - It is used to extend the functionality of individual objects in a flexible and reusable way 


*/

namespace Decorator { 

    interface Coffee { 
        int Cost();
    }

    class BasicCoffee : Coffee {
        int price;
        public int Cost()
        {
            return price;
        }
    }

    abstract class CoffeeDecorator: Coffee { 
        protected Coffee coffee;

        public CoffeeDecorator(Coffee newCoffee) { 
            coffee = newCoffee;
        }
        public abstract int Cost();
    }

    class MilkDecorator : CoffeeDecorator { 
        
        public MilkDecorator(Coffee coffee) : base(coffee) {}

        public override int Cost()
        {
            return coffee.Cost() + 2;
        }
    }

    class SugarDecorator : CoffeeDecorator { 
        
        public SugarDecorator(Coffee coffee) : base(coffee) {}

        public override int Cost()
        {
            return coffee.Cost() + 1;
        }
    }


    class Program { 
        static void Main(string[] args) {
            var coffee = new BasicCoffee();
            Console.WriteLine("Cost of basic coffee:" + coffee.Cost());

            var sugarCoffee = new SugarDecorator(coffee);
            Console.WriteLine("Cost of sugar cofee:" + sugarCoffee.Cost());

            var milkCoffee = new MilkDecorator(sugarCoffee);
            Console.WriteLine("Cost of milk coffee:" + milkCoffee.Cost());

        }
    }
}