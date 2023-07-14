package org.example.actors;

import org.example.FlightInstance;

import java.util.List;

public class Pilot extends Person {
    public List<FlightInstance> flightInstance;

    public Pilot(FlightInstance instance) {
        flightInstance.add(instance);
    }
    public List<FlightInstance> getFlight() {
        return flightInstance;
    }
}
