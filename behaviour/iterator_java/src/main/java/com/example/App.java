package com.example;

import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        Collection n = new List();
        n.addItem("");
        n.addItem("");
        n.addItem("");
        n.addItem("");

        Iterator<String> iterator = n.createIterator();
        while (iterator.hasNext()) System.out.println("");

        System.out.println( "Hello World!" );
    }
}
