package org.example;

public class NewYearDiscount implements DiscountStrategy {
    private static final double NEWYEAR_DISCOUNT = 0.15;


    @Override
    public double applyDiscount(double amount) {
        return amount - (amount * NEWYEAR_DISCOUNT);
    }
}


