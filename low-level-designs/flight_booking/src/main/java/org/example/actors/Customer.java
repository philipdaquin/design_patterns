package org.example.actors;

import org.example.FlightItinerary;
import org.example.types.Account;
import org.example.types.Address;

import java.util.List;

public class Customer extends Person {
    public List<FlightItinerary> itineraryList;

    public String frequentFlyer;

    public Customer(
            String name,
            Address address,
            String email,
            String phone,
            Account account,
            String frequentFlyer)
    {
        super(name, address, email, phone, account);
        this.frequentFlyer = frequentFlyer;
    }


    public List<FlightItinerary> getItineraryList() {
        return itineraryList;
    }

}
