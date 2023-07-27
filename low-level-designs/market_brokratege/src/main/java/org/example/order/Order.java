package org.example.order;

import org.example.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class Order {
    private int orderId;
    private OrderType orderType;
    private OrderStatus orderStatus;
    private TimeEnforcement timeEnforcement;
    private LocalDateTime createdAt;
    private Map<Integer, OrderParts> parts;

    public Order(int id, TimeEnforcement enforcement) {
        this.orderId = id;
        this.orderType = OrderType.BUY;
        this.orderStatus = OrderStatus.OPEN;
        this.timeEnforcement = TimeEnforcement.OnTheOpen;
        this.createdAt = LocalDateTime.now();
        this.parts = new HashMap<>();
    }

    public int getId() {
        return orderId;
    }


    public OrderStatus setStatus(OrderStatus status) {
        this.orderStatus = status;
        return orderStatus;
    }

    public void setOrderType(OrderType type) {
        this.orderType = type;
    }
    public void setEnforcement(TimeEnforcement enforcement) {
        this.timeEnforcement = enforcement;
    }





    public boolean addInOrder() {
        return true;
    }

    public void addOrderParts(OrderParts[] parts) {
        for (var part : parts) {
            this.parts.put(part.id,  part);
        }
    }



}
