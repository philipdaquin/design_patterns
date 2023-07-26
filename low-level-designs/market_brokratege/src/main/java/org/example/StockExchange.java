package org.example;

import org.example.enums.Status;

public final class StockExchange {
    private static volatile StockExchange exchangeInstance;
    public Status returnSuccess;

    public StockExchange() {}

    public static StockExchange getInstance() {
        StockExchange instance = exchangeInstance;

        if (instance != null)  return exchangeInstance;

        synchronized (StockExchange.class) {
            if (exchangeInstance == null) {
                exchangeInstance = new StockExchange();
            }
            return exchangeInstance;
        }

    }

    public Status placeOrder() {
        return Status.EMPTY_POSITION;
    }
}
