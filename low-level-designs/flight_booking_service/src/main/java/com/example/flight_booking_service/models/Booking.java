package com.example.flight_booking_service.models;

import com.example.flight_booking_service.models.enums.BookingStatus;

public class Booking {
    int bookingId;
    Flight flightDetails;

    BookingStatus status;
}
