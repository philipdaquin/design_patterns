
#include<iostream>;

using namespace std;

class Checkbox { 
    public: 
    virtual void render();
};


class WindowsCheckbox: public Checkbox { 
    
    void render() { 
        cout << "" ;
    }
};


class MacOSCheckbox: public Checkbox { 
    void render() { 
        cout << "" ;
    }
};