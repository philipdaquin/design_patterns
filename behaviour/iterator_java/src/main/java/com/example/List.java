package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class List implements Collection {

    public ArrayList<String> items;

    public List() { 
        items = new ArrayList<>();
    }

    @Override
    public void addItem(String item) {
        // TODO Auto-generated method stub
        items.add(item);
        
    }

    @Override
    public Iterator<String> createIterator() {
        // TODO Auto-generated method stub
        return new IteratorImpl();
    }

    
}
