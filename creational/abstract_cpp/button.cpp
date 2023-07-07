
#include <iostream>

using namespace std;

class Button { 
    
    public: 
    virtual void render() = 0;
};

class WindowsButton: Button { 
    void render() { 
        cout << "" ;
    }
};

class MacOSButton: Button { 
    public: 
    
    void render() override { 
        cout << "MacOsBUtton";
    }
};