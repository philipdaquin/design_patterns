package org.example.accounts;

import org.example.Address;
import org.example.ReportStatements;
import org.example.StockExchange;
import org.example.StockPositions;
import org.example.enums.AccountStatus;
import org.example.enums.OrderStatus;
import org.example.enums.Status;
import org.example.order.*;

import java.util.HashMap;
import java.util.List;

public class Member extends Account {
    public Boolean blocked;
    public Double availableFunds;

    // Stock Id over StockSymbol
    public HashMap<Integer, StockPositions> stockPositions;
    public List<ReportStatements> statements;
    public HashMap<Integer, Order> activeOrders;


    private final StockExchange exchange = StockExchange.getInstance();


    public Member(Integer id, String password, String name, Address address, AccountStatus status, String email, String phone) {
        super(id, password, name, address, status, email, phone);
    }


    ///
    ///
    ///
    ///
    public Status placeSellOrder(
            int stockId,
            int quantity,
            double price,
            TimeEnforcement enforcementType
    ) {

        // If the stock is not in the current Stock Position
        if (!stockPositions.containsKey(stockId)) {
            return Status.EMPTY_POSITION;
        }
        // Check if there's enough stock to sell
        if (!(stockPositions.get(stockId).quantity < quantity)) {
            return Status.INSUFFICIENT_QUANTITY;
        }

        // System deducts stock from the account
        StockPositions current = stockPositions.get(stockId);
        current.quantity -=  quantity;
        // Update old value
        stockPositions.put(stockId, current);

        // Send order to the exchange
        LimitOrder order = new LimitOrder(stockId, enforcementType);
        order.setOrderType(OrderType.SELL);
        order.addInOrder();
        order.setLimit(price);

        boolean stockExchangeResponse = exchange.placeOrder(order);

        // Check if the order has been submitted
        if (stockExchangeResponse) {
            order.setStatus(OrderStatus.FILLED);
            order.addInOrder();
        } else {
            activeOrders.put(order.getId(), order);
        }
        // System receives acknowledgement from exchange

        // System show order place message to the customer


        return stockExchangeResponse ? Status.SUCCESS : Status.FAILED ;
    }
    public Status placeBuyOrder(
            int stockid,
            int quantity,
            double price,
            TimeEnforcement enforcement
    ) {

        // If the user has sufficient funds
        if (availableFunds >= quantity * price ) return Status.INSUFFICIENT_FUNDS;

        Order order = new LimitOrder(stockid, enforcement);

        order.setOrderType(OrderType.BUY);

        order.addInOrder();
        if (exchange.placeOrder(order)) {
            order.setStatus(OrderStatus.FILLED);
            order.addInOrder();
        } else {
            activeOrders.put(order.getId(), order);
        }


        return Status.SUCCESS;

    }



}
