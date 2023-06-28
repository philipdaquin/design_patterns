package org.example;

import java.util.HashMap;
import java.util.Map;

public class ShapeManager {
    private Map<String, Shape> shapes;

    public ShapeManager() {
        shapes = new HashMap<>();

        shapes.put("rectangle", new Rectangle());
    }

    public void addShape(String key, Shape shape) {
        shapes.put(key, shape);
    }
    public Shape getShape(String key) {
        Shape shape = shapes.get(key);
        if (shape != null) return shape.clone();
        return null;
    }


}
