package org.example.open_closed_principle.no_ocp;

/*
*   Without OCP
*
*   - The `Shape` class violates the Open / Closed principle because adding a new shape
*   type requires modifying the existing `draw` method. This can lead to fragile code, as change s
*   to existing code can introduce bugs
* */
public class Shape {
    protected String type;
    public Shape(String type) { this.type = type;}

    private void drawCircle() {}
    private void drawRectangle() {}

    public void draw() {
        if (type.equals("circle")) {
            drawCircle();
        }
        drawRectangle();
    }
}
