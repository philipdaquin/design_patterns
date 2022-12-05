package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Singleton test = new Singleton("New");
        System.out.println(Singleton.getInstance("New").value);
    }
}
