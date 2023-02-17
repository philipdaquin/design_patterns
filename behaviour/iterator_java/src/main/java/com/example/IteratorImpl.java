package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorImpl implements Iterator<String> {
    private ArrayList<String> items;
    private int position;

    public IteratorImpl() { 
        this.items = new ArrayList<>();
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub

        return position < items.size();
    }

    @Override
    public String next() {
        // TODO Auto-generated method stub
        if (hasNext()) {

            String str = items.get(position);

            position +=1;
            return str;
        }
        return null;
    }
    
}
