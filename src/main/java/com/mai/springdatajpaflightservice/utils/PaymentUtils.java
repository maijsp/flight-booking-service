package com.mai.springdatajpaflightservice.utils;

import com.mai.springdatajpaflightservice.exception.NotEnoughAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {
    private static Map<String, Double> paymentMap = new HashMap<>();
    static {
        paymentMap.put("acc1", 12000.0);
        paymentMap.put("acc2", 12.0);
        paymentMap.put("acc3", 800.0);
        paymentMap.put("acc4", 5500.0);
    }

    public static boolean validateCreditLimit(String accNo, double paidAmount) {
        if(paidAmount > paymentMap.get(accNo)) {
            throw new NotEnoughAmountException("Insufficient amount to be paid");
        }
        else {
            return true;
        }
    }
}
