package org.example;

import org.example.enums.FlightStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightInstance {

    public Date departureTime;

    public List<FlightSeat> seats = new ArrayList<>();

    public FlightStatus status = FlightStatus.UNKNOWN;

    public String gate;


    public Boolean cancelFlight() {
        return true;
    }

    public void updateStatus(FlightStatus newStatus) {
        this.status = newStatus;
    }



}
