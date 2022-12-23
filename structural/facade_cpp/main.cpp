

#include<iostream>

class SubSystemA { 
    public: 
    void operationA() { 
        std::cout << "Operation A" << std::endl;
    }
};

class SubSystemB { 
    public: 
    void operationB() { 
        std::cout << "Operation B 🤣🤣🤣🤣" << std::endl;
    }
};

class SubSystemC { 
    public:
    void operationC() { 
        std::cout << "Operation C" << std::endl;
    }
};

class Facade { 
    private: 
    
    SubSystemA systemA;
    SubSystemB systemB;
    SubSystemC systemC;

    public: 
    void Operation1() { 
        systemA.operationA();
        systemB.operationB();
    }

    void Operation2() { 
        systemB.operationB();
        systemC.operationC();
    }

    void Operation3() { 
        systemA.operationA();
        systemC.operationC();
    }
};


int main() { 
    Facade facade;

    facade.Operation1();
    facade.Operation2();
    facade.Operation3();

    return 0;

}