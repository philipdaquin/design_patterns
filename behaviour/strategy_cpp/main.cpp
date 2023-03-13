#include <iostream>
#include <vector>
using namespace std;

/*
    The strategy desing pattern is a behaviorial design pattern that enables a client to choose from 
    a set of algorithms or behaviours at runtime
    
    - It allows for the encapsulation of interchangeable behaviours and their selection by the client based on the 
    context of the problem being solved

    The pattern defines a family of algorithms, encapsulates each one, and makes them ineterchangeable 
    The Strategy pattern separates the algorithm from the client and allows them to vary independently
    - The client can choose the appropriate algorithm without having to know the details of its implmentations 
*/

/*
    The pattern consists of 3 main components:

    Context
    - The object that uses a Strategy object
    - It maintains a reference to the Strategy object and provides a method to change the current Strategy object

    Object 
    - The interface or abstraction class that defines the behaviour of the algorithm 
    - Concrete implmentations of this interface or abstract class provide different variations of the algortihm 

    Concrete Strategy 
    - The actual implementation of the Strategy interface or abstract class 
    - IT provides a specific behaviour for the algorithm 
*/

class PricingStrategy { 
    // or abstract 
    //  used as a virtual function in a base class 
    public: virtual double calculatePrice(vector<double>& prices) = 0;
};

// We create concrete implementation of the PricingStrategy interface for each type of discount
class NoDiscountStrategy: public PricingStrategy { 
    public:
        double calculatePrice(vector<double>& prices) override { 
            double total = 0;
            for (auto price : prices) { 
                total += price;
            }
            return total;
        }
};
  
class PercentageDiscountStrategy: public PricingStrategy { 
    private: 
    
    double discountPercent;

    public:
        PercentageDiscountStrategy(double percent) : discountPercent(percent) {} 
        double calculatePrice(vector<double>& prices) override { 
            double total = 0;
            for (auto price : prices) { 
                total += price;
            }
            return total * (1 - discountPercent / 100);
        }
};

class FixedDiscountStategy: public PricingStrategy { 
    private: 
    double discountPercent;

    public:
        FixedDiscountStategy(double percent) : discountPercent(percent) {}
         double calculatePrice(vector<double>& prices) override { 
            double total = 0;
            for (auto price : prices) { 
                total += price;
            }
            return total - discountPercent;
        }
};

class ShoppingCarts { 
    private:
        vector<double> prices;
        PricingStrategy* pricingStrategy;
    
    public:
        double calculateTotalPrice() { 
            return pricingStrategy -> calculatePrice(prices);
        }

};


int main(int, char**) {
    // initialise pricing strategies 

    // shopping cart 


    std::cout << "Hello, world!\n";
}
