package org.example;

public class WindowsDrawingAPI implements DrawingAPI {

    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println(x + " " +  y + " "  + radius);
    }
}
