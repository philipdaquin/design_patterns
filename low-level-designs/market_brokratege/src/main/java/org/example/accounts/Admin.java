package org.example.accounts;

import org.example.Address;
import org.example.enums.AccountStatus;

import java.util.Date;

public class Admin extends Account {
    public Boolean blocked;

    public Admin(Integer id, String password, String name, Address address, AccountStatus status, String email, String phone) {
        super(id, password, name, address, status, email, phone);
    }
}
