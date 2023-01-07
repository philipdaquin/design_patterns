#include<iostream>
#include<vector>


// The command interface declares a method for executing a common 
class Command { 
    public:
    virtual void execute() = 0;
};

// Some concrete commands provide simple execution by storing a receiver
// object and invoking a method on it 
class SimpleCommand: public Command { 
    public:
    SimpleCommand(int value): value_(value) {}

    void execute() override { 
        std::cout << "Happy New Year" << std::endl;
    }

    private:
    int value_;
};

// The MacroCommand is a command that is composed of several other commands
class MacroCommand: public Command { 
    
    public: 
    MacroCommand() {}

    void addCommand(Command* command) {

        std::cout << "add new commands" << std::endl;

        commands.push_back(command);
    }

    void execute() override {
        for (const auto& command: commands) {
            command -> execute();
        }
    }

    private: 
    std::vector<Command*> commands;
};


int main() { 

    MacroCommand macro;
    macro.addCommand(new SimpleCommand(1));
    macro.addCommand(new SimpleCommand(2));
    macro.addCommand(new SimpleCommand(3));
    macro.addCommand(new SimpleCommand(4));
    macro.addCommand(new SimpleCommand(5));
    macro.addCommand(new SimpleCommand(6));
    macro.execute();

    return 0;

}