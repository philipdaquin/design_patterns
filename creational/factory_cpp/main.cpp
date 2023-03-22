#include <iostream>
#include <vector>

using namespace std;

class Product { 
    public: 
        virtual ~Product() {}
        virtual string getName() = 0;
};

class ConcreteProduct : public Product { 
    public:
        string getName() {
            return "Product A";
        }
};

class Factory { 
    public:
        virtual ~Factory() {}
        virtual Product* createProduct() = 0;
};

class ConcreteFactory : public Factory { 
    public:
        Product* createProduct() { 
            return new ConcreteProduct();
        }
};


int main(int, char**) {

    Factory* factoryA = new ConcreteFactory();
    Product* productA = factoryA -> createProduct();

    std::cout << "Hello, world!\n";
}
