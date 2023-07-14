package org.example.actors;

import org.example.FlightItinerary;

import java.util.List;

public class Customer extends Person {
    public List<FlightItinerary> itineraryList;

    public String frequentFlyer;

    public List<FlightItinerary> getItineraryList() {
        return itineraryList;
    }

}
