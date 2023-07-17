package org.example;

import java.sql.Time;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class FlightSchedule {
    public Integer dayNumber;
    public LocalDate departureTime;

    public FlightSchedule() {
        this.departureTime = LocalDate.now();
    }


}
