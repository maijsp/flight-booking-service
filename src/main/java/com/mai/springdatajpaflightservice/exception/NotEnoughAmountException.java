package com.mai.springdatajpaflightservice.exception;

public class NotEnoughAmountException extends RuntimeException {
    public NotEnoughAmountException(String message) {
        super(message);
    }
}
