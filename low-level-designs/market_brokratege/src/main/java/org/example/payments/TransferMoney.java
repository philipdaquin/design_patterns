package org.example.payments;

import java.util.Date;

public class TransferMoney {
    public Date createdAt;
    public Double amount;
    public String fromAccount;
    public String toAccount;

    public Boolean execute() {
        return true;
    }
}
