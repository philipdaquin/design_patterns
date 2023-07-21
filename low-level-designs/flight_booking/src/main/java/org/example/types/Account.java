package org.example.types;

import org.example.enums.AccountStatus;

public class Account {
    private String id;
    private String password;
    private AccountStatus status;


    public Account(String id, String password, AccountStatus status) {
        this.id = id;
        this.password = password;
        this.status = status;
    }

    public void resetPassword() {
        System.out.println("Resetting the password");
    }

}
