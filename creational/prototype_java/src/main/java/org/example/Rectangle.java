package org.example;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public Shape clone() {
        return new Rectangle();
    }
}
