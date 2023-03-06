#include <iostream>
#include <string>
#include <vector>

/*
    The command design pattern is a behaviourial pattern that encapsulates a request or an 
    operation as an object, allowing you to parameterize clients with different requests, queue, 
    or log requests, and support undoable operations

    There are four main components:
    - Client
    - The Invoker
    - The Command
    - the Receiver
    

*/

using namespace std ;

// The receiver 
class Light { 

    public:
    void turnOn() { 
        cout << "Light is on";
    }
    void turnOff() { 
        cout << "Light is off";
    }
};

// The command interface
class Command { 
    public:
    virtual void execute() = 0;
};


// The concrete command for turning on the light
class TurnOnCommand: public Command { 
    
    Light& light;
    
    public: 
    TurnOnCommand(Light& light_) : light(light_) {}

    void execute() override { 
        light.turnOn();
    }
};

class TurnOffCommand: public Command { 
    Light& light;
    
    public:
    TurnOffCommand(Light& light_) : light(light_){}

    void execute() override { 
        light.turnOff();
    }
};

// the invoker 
class RemoteControl { 
    Command* command;

    public: 
    void setCommand(Command& command_) { 
        command = &command_;
    }

    void pressButton() { 
        command->execute();
    }

};



int main(int, char**) {

    Light light;
    TurnOnCommand turnOn(light);

    TurnOffCommand turnOff(light);

    RemoteControl remoteControl;

    remoteControl.setCommand(turnOn);
    remoteControl.pressButton();
    
    remoteControl.setCommand(turnOff);
    remoteControl.pressButton();
}
