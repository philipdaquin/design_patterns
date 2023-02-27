package com.example.flight_booking_service.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Airline {
    private final int airlineId;
    public String airlineName;
}
