package org.example.accounts;

import org.example.Address;
import org.example.enums.AccountStatus;

public class Account {
    private Integer id;
    private String password;
    private String name;
    private Address address;
    public AccountStatus status = AccountStatus.NONE;
    public String email;
    private String phone;

    public Account(
            Integer id,
            String password,
            String name,
            Address address,
            AccountStatus status,
            String email,
            String phone
    ) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.address = address;
        this.status = AccountStatus.NONE;
        this.email = email;
        this.phone = phone;
    }

    public Boolean resetPassword() {
        return true;
    }

}
