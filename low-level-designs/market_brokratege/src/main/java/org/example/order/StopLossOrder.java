package org.example.order;

public class StopLossOrder extends Order {
    public double priceLimit;

    public StopLossOrder(int id) {
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
