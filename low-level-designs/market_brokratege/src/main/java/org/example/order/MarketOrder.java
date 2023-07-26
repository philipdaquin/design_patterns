package org.example.order;

public class MarketOrder extends Order {
    public Double price;

    public MarketOrder(int id) {
        super(id);
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
