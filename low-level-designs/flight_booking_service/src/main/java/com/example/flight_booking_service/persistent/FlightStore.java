package com.example.flight_booking_service.persistent;

import java.util.HashMap;

import com.example.flight_booking_service.models.Flight;

public class FlightStore {
    public HashMap<Integer, Flight> flights = new HashMap<>();

    public void addFlight(Flight newFlight) { 
        flights.put(newFlight.getFlightNumber(), newFlight);
    }
}
