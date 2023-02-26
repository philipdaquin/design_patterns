package com.example;


// * - Originator: The object whose state needs to be saved and restored 
public class Originator {
    private String text;

    public void setText(String text) { 
        this.text = text;

    }
    public String getText() { 
        return this.text;
    }
    
    public Memento save() { 
        return new Memento(this.text);
    }

    public void restore(Memento memento) { 
        this.text = memento.getText();
    }


}
