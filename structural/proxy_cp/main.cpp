#include <iostream>

using namespace std;

/*
    The Proxy design pattern is a structural desing pattern that provides a surrogate or placeholder for 
    another object to control access to it

    The primary intent of the proxy pattern is to create a representative object that can act as an intermediatry between 
    client and the real subject object 
    - The client interacts with the proxy object, which in turn delegates the requests to the real object

    - This allows the proxy object to add extra functionality to the real object or to retrict access to it 


    Types
    - Remote Proxy - local representation of a remote object 

    - Virtual Proxy - A placeholder for an expensive or resouce intensive object, which is loaded only when t is needed

    - Protection Proxy - allow or deny requests based on certain criteria 
*/

// Declare the common operations for both realSubject and proxy 
class Subject { 
    // Inline 
    public:
    virtual ~Subject() {}
    virtual void request() const = 0;
};
// The main object 
class RealSubject: public Subject { 
    public:
    void request() const override { 
        cout << "Real Subject: Handling Request" << endl;
    }
};

// The proxy 
class Proxy: public Subject { 
    RealSubject* subject;
    bool isAuthorised;
    
    public:
    //  Construct 
    Proxy(RealSubject& realSubject) : subject(new RealSubject(realSubject)), isAuthorised(false) {}
    
    ~Proxy() { 
        delete subject;
    }
    // Maintain reference 
    void request() const override { 
        if (!isAuthorised) cout << "Proxy: Unauthorised request. Access denied." << endl;
        else { 
            subject -> request();
        }
    }

    void authorised() { 
        isAuthorised = true;
    }



};

// Client code 
void client_code(const Subject& subject) { 
    subject.request();
}


int main(int, char**) {
    std::cout << "Hello, world!\n";
}
