package com.learn.srpingboot.SPRING_AXYYA.pojo;

import com.learn.srpingboot.SPRING_AXYYA.model.Flight;
import com.learn.srpingboot.SPRING_AXYYA.model.Passenger;

import javax.persistence.*;
import java.util.List;

public class BookingDetails {
    private String bookingDate;
    private Integer noOfPassengers;
    private Flight flight;
    private List<Passenger> passengers;

    public BookingDetails(String bookingDate, int noOfPassengers, Flight flight, List<Passenger> passengers) {
        this.bookingDate = bookingDate;
        this.noOfPassengers = noOfPassengers;
        this.flight = flight;
        this.passengers = passengers;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }
}
