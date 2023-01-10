package com.example;

/**
 * The Template Method Pattern is a design pattern that defines the 
 * skeleton of an algorithm in a method, called the template method, adn allow subclkasses to fill in 
 * certain steps of the algorithm without changing the overall structure of the algorithm
 * 
 * For example, let's say you are building a software system that needs to process various file types (e.g., text files, image files, video files, etc.). Each file type has its own unique way of being processed, but the overall process for all file types is the same
 * 
 *  1. Open the file
 *  2. Read the file
 *  3. Process the file
 *  4. Close the file
 * 
 *  In the end, the template method pattern allows you to define a common structure 
 *  for an algorithm, while still allowing subclasses to provice their own implementation details for cetain
 *  steps for certain steps of the algorithm
 * 
 * It's mostly used for abstraction for similar objects to reduce code duplication, its often used with the strategy 
 * pattern in order to use different behaviours or algorithm in runtime and make it interchangeable
 *
 */
public class App  {
    
    public static void main( String[] args ) {
        TextFile textFile = new TextFile();

        textFile.closeFile();
        
        System.out.println( "Hello World!" );
    }
}
