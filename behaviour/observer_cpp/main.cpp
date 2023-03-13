#include <iostream>
#include <vector>
using namespace std;
/*

    The observer design pattern is a behaviorual design pattern that allows an objset to 
    to notify other objects automatically when its state chnages 


*/

class Observer { 
    public:
        virtual void update(int value) = 0;
};

class Subject { 
    vector<Observer*> observers;
    int value;

    public:
        void attach(Observer* observer) { 
            observers.push_back(observer);
        }

        void notify() {
            for (Observer* ob : observers) { 
                ob->update(value);
                cout << "Received update with value:"<< value << endl;
            }
        } 
        void setValue(int value) { 
            this->value = value;
            notify();
        }

};

int main(int, char**) {

    Subject subject;

    // subject.attach();
    subject.setValue(10);



    std::cout << "Hello, world!\n";

    return 0;
}
