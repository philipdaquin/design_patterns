package com.example.flight_booking_service.models;

import java.time.Duration;
import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Flight {
    
    // A unique identifier for the flight 
    int flightNumber;

    // The airport where the flight departs from 
    Airport departureAirport;

    // The airport where the flight arrives at 
    Airport arrivalAirport;

    // The date and time when the flights departs 
    Instant departureTime;

    // The data and time when the flight arrives 
    Instant arrivalTime;

    // The amount of time the flight takes from departure
    Duration flightDuration;

    // The cost of a ticker for the flights
    Float price;

    // The airline that operates the flights 
    Airline airline;

    // The number of available seats 
    int availableSeats;

    // The number of taken seats 
    int bookedSeats;
}
