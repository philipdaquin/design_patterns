package org.example.order;

import java.util.Date;

public class OrderParts {
    public Integer id;
    public Double price;
    public Integer quantity;
    public Date executedDate;

    public Date getExecutedDate() {
        return executedDate;
    }

}
