package com.example;

import java.util.Stack;

// * - CareTaker: an object that manages and keeps track of Memento
public class CareTaker {
    private Stack<Memento> history = new Stack<>(); 

    public void save(Originator orignator) { 
        this.history.push(orignator.save());
    }

    public void undo(Originator originator) { 
        if (!history.isEmpty()) {
            Memento memento = this.history.pop();
            
            originator.restore(memento);

        }
    }


}
