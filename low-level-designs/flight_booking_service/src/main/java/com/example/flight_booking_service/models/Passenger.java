package com.example.flight_booking_service.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@AllArgsConstructor
public class Passenger {
    private final Integer id;
    public String firstName;
    public String lastName;
    public String email;
    private final String password;
}
