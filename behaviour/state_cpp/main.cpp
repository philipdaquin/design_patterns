#include <iostream>

/*
    THe State design pattern is a behaviourial design pattern that allows an object 
    to alter its behaviour when its internal state changes 

    The pattern separates the object's behavior into distint states that can be swapped at runtime 

*/

using namespace std;

class State { 
    public:
    virtual void handle() = 0;
};

class StateA : public State { 
    public:  
    void handle() { 
        cout << "StateA::handle()" << endl;
    }
};
class StateB : public State { 
    public:
    void handle() { 
        cout << "StateB::handle()" << endl;
    }
};

class Context { 
    private:
        State* state;
    
    public:
    Context(State* s) {
        state = s;
    }

    void setState(State* s) { 
        state = s;
    }

    void request() { 
        state -> handle();
    }

};




int main(int, char**) {

    StateA* stateA = new StateA();
    StateB* stateB = new StateB();

    Context* context = new Context(stateA);

    context -> request();

    context -> setState(stateB);

    context -> request();

    std::cout << "Hello, world!\n";
}
