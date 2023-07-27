package org.example.order;

public class LimitOrder extends Order {
    public double priceLimit;

    public LimitOrder(
            int id,
            TimeEnforcement enforcementType
    ) {
        super(id, enforcementType);
        this.priceLimit = 0.0;
    }
    public double getPriceLimit() {
        return priceLimit;
    }
    public void setLimit(double limit) {
        this.priceLimit = limit;
    }
}
