package org.example;

import java.util.List;

public class Flight {
    public String flightNumber;
    public Airport departure;
    public Airport arrival;
    public Integer flightDuration;
    public Boolean cancelled;
    public FlightSchedule schedule = null;







    public List<FlightInstance> instances;

    public List<FlightInstance> getInstances() {
        return instances;
    }
    public Boolean cancelFlight() {

        return cancelled;
    }
    public Boolean addFlightSchedule() {

        if (schedule == null) {
            this.schedule = new FlightSchedule();
            return true;
        }
        return false;
    }

}
