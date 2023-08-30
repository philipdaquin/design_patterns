package org.example.liskov_substitution;

/*
*   Liskov
*   This example adheres to the Liskov Substitution principle. You can replace an instance of the parent
*   class with an instance of any of its subclasses without affecting the correctness of the program
*
* */
public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
