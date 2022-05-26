package com.learn.srpingboot.SPRING_AXYYA.exception;

public class BookingNotFoundException extends RuntimeException{

    private String message ;

    public BookingNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
