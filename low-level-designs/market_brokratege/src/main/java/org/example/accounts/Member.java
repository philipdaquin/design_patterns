package org.example.accounts;

import org.example.Address;
import org.example.ReportStatements;
import org.example.StockPositions;
import org.example.enums.AccountStatus;

import java.util.HashMap;
import java.util.List;

public class Member extends Account {
    public Boolean blocked;
    public Double availableFunds;

    // Stock Id over StockSymbol
    public HashMap<Integer, StockPositions> stockPositions;
    public List<ReportStatements> statements;

    public Member(Integer id, String password, String name, Address address, AccountStatus status, String email, String phone) {
        super(id, password, name, address, status, email, phone);
    }



}
