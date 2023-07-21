package org.example.actors;

import org.example.FlightItinerary;
import org.example.types.Account;
import org.example.types.Address;

public class DeskOfficer extends Person {
    public FlightItinerary itinerary = null;

    public DeskOfficer(String name, Address address, String email, String phone, Account account) {
        super(name, address, email, phone, account);
    }

    public Boolean createItinerary() {
        if (itinerary == null) {
            this.itinerary = new FlightItinerary();
            return true;
        }
        return false;
    }
}
