package org.example;

import org.example.actors.Passenger;
import org.example.payment.Payment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FlightReservation {
    public String reservationId;
    public FlightInstance flightInstance;
    public HashMap<Passenger, FlightSeat> seatMappings;

    public Payment payment;

    public List<Passenger> getPassengers() {
        List<Passenger> passengers = new ArrayList<>();

        for (Passenger passenger : seatMappings.keySet()) {
            passengers.add(passenger);
        }

        return passengers;
    }

}
