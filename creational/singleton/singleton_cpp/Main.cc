
#include <iostream>
#include <mutex>
#include <thread>

class Singleton {
    private: 

        static std::mutex mutex;
        static Singleton* instance;

    protected:
        Singleton() {};

        std::string value;

        Singleton(const std::string value): value(value) {}
    
    public: 
        Singleton(const Singleton&) = delete;
        Singleton& operator = (const Singleton&) = delete;

        static Singleton* getInstance() {
            if (instance == NULL) {
                instance = new Singleton();
            }
            return instance;
        }


};



int main() {

    return 0;
}