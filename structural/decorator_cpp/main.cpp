#include <iostream>

using namespace std;

/*
    The Decorator pattern is a design pattern in OOP
    - Allows behaviour to be added to an individual object, either statically ro dynamically, without 
        affecting the behaviour of other objects from the same class 
    
    A decorator is a class that wraps around an object to extend its functionality or modify its behavior, while 
    maintaining the original object's interface
    The decorator class has the same interface as the object it is decorating, and it can add new functionalities before or
    after delegating the call to the original object.

    This allows for the creation of complex objects by combining simple objects with various combinations of decorators 
*/


// Interface 
class Pizza { 
    public:
    virtual void prepare() = 0;
    virtual ~Pizza() {}
};

// component
class MargaritaPizza: public Pizza { 
    void prepare() { 
        cout << "Preparing Margarita pizza";
    }
};

class PizzaDecorator: public Pizza { 
    protected:
    Pizza* pizza;

    public:
    PizzaDecorator(Pizza* pizza) { 
        this -> pizza = pizza;
    }
    void prepare() { 
        pizza -> prepare();
    }
};

class ExtraCheese : public PizzaDecorator { 
    
    public:

    ExtraCheese(Pizza* pizza) : PizzaDecorator(pizza) {}
    void prepare() { 
        pizza->prepare();
        addExtraCheese();
    }
    
    void addExtraCheese() { 
        cout << "Adding extra muffker";
    }
};



int main(int, char**) {

    Pizza* pizza = new MargaritaPizza();
    ExtraCheese cheese = new ExtraCheese(pizza);

    pizza->prepare();

    std::cout << "Hello, world!\n";

    return 0;
}
