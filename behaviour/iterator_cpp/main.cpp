#include <iostream>
#include <vector>
using namespace std;

// Iterator interface
template<typename T> class Iterator { 
    
    public:
        virtual T next() = 0;
        virtual bool hasNext() = 0;
};

// Concrete iterator implementation for a vector 
template<typename T> class VectorIterator : public Iterator<T> { 
    private:
        int data;
        size_t index;
    public: 
        VectorIterator(vector<T>& data_) : data(data_), index(0) {} 

        T next() override { 
            return data[index++];
        }

        bool hasNext() override { 
            return index < data.size();
        }
};

template<typename T> class Aggregate { 
    public: 
        virtual Iterator<T>* createIterator() = 0;
};

template<typename T> class VectorAggregate: public Aggregate<T> {
    private:
        vector<T> data:
    Iterator<T>* createIterator() override { 
        return new VectorIterator<T>(data);
    }
};

int main(int, char**) {
    std::cout << "Hello, world!\n";
}
