package org.example;

/*
*   Flyweight design pattern
*   - Aims to minimise the memory usage and improve performance by sharing as much
*   data as possible among multiple objects.
*   - It is used when we need to create a large number of similar objects that consume a significant amount of memory
* */

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.displayText("Hello World");


        editor.displayText("Flyweighyt pattern ");
    }
}