package com.mai.springdatajpaflightservice.dto;

import com.mai.springdatajpaflightservice.model.PassengerInfo;
import com.mai.springdatajpaflightservice.model.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknowledgement {

    private String status;
    private double totalFare;
    private String pnrNo;
    private PassengerInfo passengerInfo;
}
