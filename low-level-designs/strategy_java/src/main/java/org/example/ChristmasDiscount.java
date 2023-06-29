package org.example;

public class ChristmasDiscount implements DiscountStrategy {

    private static final double DISCOUNT_PERCENTAGE = 0.2;

    @Override
    public double applyDiscount(double amount) {
        return amount - (amount * DISCOUNT_PERCENTAGE);
    }
}
