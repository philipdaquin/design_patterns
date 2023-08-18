#include <iostream>
#include <string>
#include <vector>


use namespace std;




class Prototype { 
    public:
    virtual Prototype* clone() const = 0;
    virtual void printInfo() const = 0;
};


class ConcretePrototype: public Prototype { 
      
};


int main(int, char**){
    cout << "Hello, from prototype_cpp!\n";
}
