package org.example.actors;

import org.example.FlightInstance;

import java.util.List;

public class Crew extends Person {
    public List<FlightInstance> flightInstance;

    public Crew(FlightInstance instance) {
        flightInstance.add(instance);
    }

    public List<FlightInstance> getFlights() {
        return flightInstance;
    }
}
