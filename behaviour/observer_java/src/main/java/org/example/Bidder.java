package org.example;

public class Bidder implements Observer {
    private String name;

    public Bidder(String name) {
        this.name = name;
    }

    @Override
    public void update(int price) {
        System.out.println(name + "received an update: The current price is now:" + price);
    }
}
