package org.example;

import java.util.ArrayList;
import java.util.List;

public class Auctioneer {
    private int currentPrice;
    private List<Observer> observers;


    public Auctioneer() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }
    public void setBid(int price) {
        this.currentPrice = price;
        notifyObservers();
    }


    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(currentPrice);
        }
    }


}
