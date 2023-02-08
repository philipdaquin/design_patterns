package com.example;

import com.example.carParts.Body;
import com.example.carParts.Car;
import com.example.carParts.Engine;
import com.example.carParts.Wheels;

public interface Visitor {
    void visit(Engine engine);
    void visit(Body body);
    void visit(Car car);
    void visit(Wheels wheel);
}
