#include <iostream>
#include<mediator_cpp/mediator.cpp>
#include<mediator_cpp/colleague.cpp>

/*
    The Mediator Design pattern is a behaviourial design pattern that allows objects to communicate indirectly 
    with each other to reduce to reduce couplign and promote loose couplying between objects

    THis pattern provides a unified interface through which objects communicate with each other and eliminates
    the need for objects to have direct references to each other, thereby reducing the risk of dependency cycles 
    and allowing objects to evolve independently 


    Mediator pattern is in air traffic control system
    - the aircraft are the objects and the air traffic control system tower acts as a mediator 
*/



int main(int, char**) {
    std::cout << "Hello, world!\n";

    Mediator *mediator = new ConcreteMediator();

    Colleague *colleague1 = new ConcreteColleage(mediator);

    mediator->addColleague(colleague1);

    colleague1->send("asdasdasd");
    

}
