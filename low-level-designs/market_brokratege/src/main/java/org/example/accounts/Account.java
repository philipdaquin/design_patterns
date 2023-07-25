package org.example.accounts;

import org.example.Address;
import org.example.enums.AccountStatus;

public class Account {
    private Integer id;
    private String password;
    private String name;
    private Address address;
    public AccountStatus status;
    public String email;
    private String phone;

    public Boolean resetPassword() {
        return true;
    }

}
