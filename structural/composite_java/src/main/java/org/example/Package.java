package org.example;

import java.util.ArrayList;
import java.util.List;

public class Package implements Product {
    private String name;
    private List<Product> products = new ArrayList<>();

    public Package(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;

        for (Product product : products) {
            totalPrice += product.getPrice();
        }


        return totalPrice;
    }

    @Override
    public void displayInfo(String prefix) {
        System.out.println(prefix + name + "$" + getPrice());
        for (Product product: products) {
            product.displayInfo(prefix + "---");
        }
    }

}
