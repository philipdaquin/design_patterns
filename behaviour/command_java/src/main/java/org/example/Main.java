package org.example;

/*
*   Command Design pattern focuses on encapsulating a request as an object, thereby allowing users
*   to parameterise clients with different requests, queue or log requests, and support undoable operations.
*
*
*   1. Command
*   2. Concrete Command
*   3. Invoker
*   4. Receiver
*
*
* */


public class Main {
    public static void main(String[] args) {
        Television television = new Television();

        // Create the command
        TurnOnCommand turnOn = new TurnOnCommand(television);
        TurnOffCommand turnOff = new TurnOffCommand(television);

        // Create the invoker
        RemoteControl remoteControl = new RemoteControl();

        // set and execute the turn on command
        remoteControl.setCommand(turnOn);
        remoteControl.pressButton();

        // set and execute the turn off command
        remoteControl.setCommand(turnOff);
        remoteControl.pressButton();

    }
}