package com.example.carParts;

import com.example.CarElement;
import com.example.Visitor;

public class Car implements CarElement {
    CarElement[] elements;


    public Car() { 
        this.elements= new CarElement[] {
            new Wheels("front right"),
            new Wheels("front left"),
            new Wheels("back right"),
            new Wheels("back left"),
            new Body(),
            new Engine()
        };
    }

    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stub
        
        for (CarElement el : elements ) { 
            el.accept(visitor);
        }
        visitor.visit(this);
    }
    
}
