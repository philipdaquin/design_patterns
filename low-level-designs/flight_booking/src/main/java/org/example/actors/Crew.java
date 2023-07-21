package org.example.actors;

import org.example.FlightInstance;
import org.example.types.Account;
import org.example.types.Address;

import java.util.List;

public class Crew extends Person {
    public List<FlightInstance> flightInstance;

    public Crew(String name, Address address, String email, String phone, Account account) {
        super(name, address, email, phone, account);
    }

    public List<FlightInstance> getFlights() {
        return flightInstance;
    }
}
