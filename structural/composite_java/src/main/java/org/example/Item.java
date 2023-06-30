package org.example;

public class Item implements Product {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void displayInfo(String prefix) {
        System.out.println(prefix + name + "$" + price);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
