package org.example;

public class Circle extends Shape  {
    private double x, y, radius;



    public Circle(
            double x,
            double y,
            double radius,
            DrawingAPI drawingAPI
    ) {
        super(drawingAPI);
        this.y = y;
        this.x = x;
        this.radius = radius;

    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x,  y, radius);
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }
}
