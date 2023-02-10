
#include<string>
#include<vector>
#include<iostream>

class Mediator { 
    public: 
    virtual void send(const std::string  &message, const class Colleague *sender) = 0;
};


class ConcreteMediator: public Mediator { 
    private:
    std::vector<Colleague *> colleagues;

    public:
    void addColleague(Colleague *colleague) { 
        colleagues.push_back(colleague);
    }

    void send(const std::string &message, const Colleague *sender) override {
        for (auto colleague : colleagues) { 
            if (colleague != sender) { 
                colleague ->receive(message);
            }
        }
    }
};




