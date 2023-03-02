
#include<stdio.h>
#include<iostream>


using namespace std;


/*
    The Memento design pattern is a behavioural design pattern that enables the capture and 
    externalisation of an object's internal state so that the object can be restored to that state later 

    Useful in situations where an object's state changes over time, and it's necessary to restore the object
    to a previous state
    
    With the Memento pattern, the object doesn't need to expose its entire state to the client, but only the state
    that needs to be saved and restored 


*/
class Memento { 
    private:
    string state_;

    public:
    Memento(const string& state): state_(state) {}
    string GetState() const { 
        return state_;
    }
};


class Originator {
    private:
    string state_;

    public:
    Originator() : state_("") {};
    void SetState(const string& state) { 
        state_ = state;
    }

    Memento SaveToMemento() const { 
        return Memento(state_);
    }

    void RestoreFromMemento(const Memento& memento) { 
        state_ = memento.GetState();
    }
};

class CareTaker { 
    private:
    Memento memento_;

    public:
    CareTake() memento_("") {};
    void SetMemento(const Memento& memento) { 
        memento_ = memento; 
    }
    Memento GetMemento() const { 
        return memento_;
    }
};

int main() { 
    cout << "hello";

    Originator originator;

    CareTaker caretaker;

    originator.SetState("State");

    caretaker.SetMemento(originator.SaveToMemento());    


    cout << endl;
    originator.RestoreFromMemento(caretaker.GetMemento());

    return 0;
}