#include <iostream>
#include <vector>

using namespace std;
/*
    The Visitor allows you to add new behaviours to an existing object structrue without changing the structure itself

    It is used when you have a complex object struture, and you want to perform various 
    operations on the elements of the structure 

    Main advantage 
    - Separates the algorithm from the object structure, making it easy to add new operations to the structure 
        without modifying the exisiting code 
    
    - It makes it easy to perform different operations on the same object structure, simply by creating 
        different visitor object

    - Implementing the Vistor pattern can be complex and may require a lot of boiletplate code. It is typically
        used when you have a alrge and complex structure, and when you anticipate that you will need to add new operations to the structure over time 
*/

class Element;

class Visitor { 
    public:
        virtual void visit(Element& el) = 0;
};

class Element { 
    public:
        virtual void accept(Visitor& vi) = 0 ;
};

class ElementA: public Element { 
    public:
        void accept(Visitor& vi) override { 
            vi.visit(*this);
        }
        void operation() { 
            cout << "Performing operation A";
        }
};

class VisitorA: public Visitor { 
    public: 
        void visit(Element& el) override { 
            if (dynamic_cast<ElementA*>(&el)) { 
                
                cout << "Visitor 1 is visiting Element A";

                ElementA& elementA = dynamic_cast<ElementA&>(el);
                elementA.operation();
            }
        }
};

int main(int, char**) {
    vector<ElementA*> elements = {new ElementA()};
    VisitorA vi;
    for (const auto el : elements) { 
        el->accept(vi);
    }

    for (const auto el : elements) { 
        delete el;
    }

    std::cout << "Hello, world!\n";

    
    return 0;
}
