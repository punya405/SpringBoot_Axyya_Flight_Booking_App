package com.learn.srpingboot.SPRING_AXYYA.pojo;

import com.learn.srpingboot.SPRING_AXYYA.model.Flight;
import com.learn.srpingboot.SPRING_AXYYA.model.Passenger;

import java.util.List;

public class BookingFlightPassenger {

    private Flight flight;
    private List<Passenger> passenger;



    public Flight getFlight() {
        return flight;
    }



    public List<Passenger> getPassenger() {
        return passenger;
    }



    public void setFlight(Flight flight) {
        this.flight = flight;
    }



    public void setPassenger(List<Passenger> passenger) {
        this.passenger = passenger;
    }



    @Override
    public String toString() {
        return "BookingFlightPassenger [flight=" + flight + ", passenger=" + passenger + ", getFlight()=" + getFlight()
                + ", getPassenger()=" + getPassenger() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }

}
