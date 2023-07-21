package org.example.actors;

import org.example.enums.AccountStatus;
import org.example.types.Account;
import org.example.types.Address;

public abstract class Person {
    private String name;
    private Address address;
    private String email;
    private Account account;
    private String phone;
    // Defaulted to 'Closed'
    public AccountStatus accountStatus;

    public Person(String name, Address address, String email, String phone, Account account) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.account = account;
    }
}
