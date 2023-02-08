package com.example.carParts;

import com.example.CarElement;
import com.example.Visitor;

public class Engine implements CarElement {

    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stub
        visitor.visit(this);
        
    }
    
}
