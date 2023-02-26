package com.example;


//  * - Memento: An object that stores the state of the Originator 
public class Memento {
    private String text; 


    public Memento(String text) { 
        this.text = text;
    }

    public String getText() { 
        return this.text;
    }
}
