package org.example;

public class LinuxDrawingAPI implements DrawingAPI {

    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println(x + " " +  y + " "  + radius);
    }
}
