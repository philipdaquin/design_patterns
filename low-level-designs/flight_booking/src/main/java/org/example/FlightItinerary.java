package org.example;

import java.util.Date;
import java.util.List;

public class FlightItinerary {
    public Airport initial;
    public Airport finalAirport;
    public Date createdAt;
    public List<FlightReservation> reserves;

    public List<FlightReservation> getReservations() {
        return reserves;
    }

    public Boolean setReservation() {
        return true;
    }
    public Boolean createPayment() {
        return true;
    }

}
