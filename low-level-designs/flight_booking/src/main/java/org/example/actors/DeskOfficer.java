package org.example.actors;

import org.example.FlightItinerary;

public class DeskOfficer extends Person{
    public FlightItinerary itinerary = null;

    public Boolean createItinerary() {
        if (itinerary == null) {
            this.itinerary = new FlightItinerary();
            return true;
        }
        return false;
    }
}
