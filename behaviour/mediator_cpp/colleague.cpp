
#include<string>
#include<vector>
#include<iostream>

#include<mediator_cpp/mediator.cpp>

class Colleague { 
    protected:

    Mediator *mediator;

    public:

    Colleague(Mediator *mediator = NULL) : mediator(mediator) {}
};


class ConcreteColleage : public Colleague { 
    public: 

    ConcreteColleage(Mediator *mediator) : Colleague(mediator) {}


    void send(const std::string &message) { 
        mediator->send(message, this);
    }
    void receive(const std::string &message) { 
        std::cout << "Received message:" << message << std::endl;
    }
};
