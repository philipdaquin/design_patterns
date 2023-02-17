package com.example;

import java.util.Iterator;

public interface Collection {
    void addItem(String item);

    Iterator<String> createIterator();
}
