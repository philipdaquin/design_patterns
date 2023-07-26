package org.example;

import org.example.enums.OrderStatus;
import org.example.enums.Status;
import org.example.order.Order;

public final class StockExchange {
    private static volatile StockExchange exchangeInstance;
    public Status returnSuccess;

    public StockExchange() {}

    // Provide access to the singleton instance
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

    public OrderStatus placeOrder(Order order) {
        var ret = getInstance().submitOrder(order);
        return ret;
    }

    private OrderStatus submitOrder(Order order) {
        return OrderStatus.OPEN;
    }
}
