package com.mai.springdatajpaflightservice.service;

import com.mai.springdatajpaflightservice.dto.FlightBookingAcknowledgement;
import com.mai.springdatajpaflightservice.dto.FlightBookingRequest;
import com.mai.springdatajpaflightservice.model.PassengerInfo;
import com.mai.springdatajpaflightservice.model.PaymentInfo;
import com.mai.springdatajpaflightservice.repository.PassengerInfoRepository;
import com.mai.springdatajpaflightservice.repository.PaymentInfoRepository;
import com.mai.springdatajpaflightservice.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class FlightBookingService {

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;
    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Transactional
    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {
        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();

        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());

        paymentInfo.setPassengerId(passengerInfo.getPId());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return new FlightBookingAcknowledgement("SUCCESS", passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0], passengerInfo);
    }
}
