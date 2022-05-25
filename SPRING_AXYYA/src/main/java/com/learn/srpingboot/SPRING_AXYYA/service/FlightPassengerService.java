package com.learn.srpingboot.SPRING_AXYYA.service;

import com.learn.srpingboot.SPRING_AXYYA.model.Passenger;
import com.learn.srpingboot.SPRING_AXYYA.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightPassengerService {
    //business logic
    @Autowired
    PassengerRepository passengerRepository;

    public  List<Passenger> getPassengers() {
        List<Passenger> passengerOpt = passengerRepository.findAll();
      return passengerOpt;
    }

    public List<Passenger> getGenderPassenger(String gender, String destination) {
         return passengerRepository.getCustomQuery(gender, destination);
    }

}
