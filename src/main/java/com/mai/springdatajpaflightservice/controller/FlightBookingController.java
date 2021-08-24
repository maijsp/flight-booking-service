package com.mai.springdatajpaflightservice.controller;

import com.mai.springdatajpaflightservice.dto.FlightBookingAcknowledgement;
import com.mai.springdatajpaflightservice.dto.FlightBookingRequest;
import com.mai.springdatajpaflightservice.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightBookingController {

    @Autowired
    FlightBookingService flightBookingService;

    @PostMapping(path = "/bookFlightTicket")
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request) {
        return flightBookingService.bookFlightTicket(request);
    }
}
