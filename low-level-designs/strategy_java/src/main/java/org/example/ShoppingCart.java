package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Double> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(double price) {
        items.add(price);
    }
    public double calculateTotal(DiscountStrategy strategy) {
        var total = items.stream().mapToDouble(Double::doubleValue).sum();
        return strategy.applyDiscount(total);
    }

}
