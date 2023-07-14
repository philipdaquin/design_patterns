package org.example.actors;

import org.example.enums.AccountStatus;
import org.example.types.Address;

public abstract class Person {
    public String name;
    public Address address;
    public String email;

    // Defaulted to 'Closed'
    public AccountStatus accountStatus;
}
