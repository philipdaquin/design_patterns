package org.example.order;

public class StopLimitOrder extends Order {
    private double priceLimit;

    public StopLimitOrder(int id) {
        super(id);
        this.priceLimit = 0.0;
    }

    public double getPriceLimit() {
        return priceLimit;
    }
    public void setLimit(double limit) {
        this.priceLimit = limit;
    }


}
