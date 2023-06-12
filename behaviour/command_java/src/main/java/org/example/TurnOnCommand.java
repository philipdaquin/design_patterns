package org.example;

public class TurnOnCommand implements  Command {

    Television television;
    public TurnOnCommand(Television television) {
        this.television = television;
    }
    @Override
    public void execute() {
        television.turnOn();
    }
}


