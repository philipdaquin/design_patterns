package org.example.interface_segregation;

/*
*   ISP states that clients should not be forced to depend on interfaces they do not use
*   Document does not follow ISP
* */
public class WordDocument implements Document {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void save() {

    }

    @Override
    public void print() {

    }

}
