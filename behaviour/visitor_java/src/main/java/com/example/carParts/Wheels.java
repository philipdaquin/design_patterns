package com.example.carParts;

import com.example.CarElement;
import com.example.Visitor;

public class Wheels implements CarElement{
    String direction;

    public Wheels(String name) {
        this.direction = name;
    }

    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stub
        
    }

}
