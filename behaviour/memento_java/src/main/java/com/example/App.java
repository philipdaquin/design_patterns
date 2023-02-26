package com.example;

/**
 *  Memento Design 
 *  - Design pattern is a behaviourial pattern that provides the ability to restore an object to 
 *    its previous state without violating encapsulation 
 * 
 * This pattern consists of 3 main components:
 * - Originator: The object whose state needs to be saved and restored 
 * - Memento: An object that stores the state of the Originator 
 * - CareTaker: an object that manages and keeps track of Memento
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );


        Originator editor = new Originator();
        CareTaker history = new CareTaker();

        editor.setText("💽💽");
        history.save(editor);

        editor.setText("🚀🚀🚀🚀🚀");
        history.save(editor);

        System.out.println(editor.getText());

        history.undo(editor);

        System.out.println(editor.getText());

    }
}
