package org.example;

import java.util.ArrayList;
import java.util.List;

public class FlightSeat {
    public Float fare;
    public FlightReservation reservation;

    public FlightSeat setReservation(FlightReservation newReservation) {
        this.reservation = newReservation;
        return this;
    }


    public Float getFare() {
        return fare;
    }
}
