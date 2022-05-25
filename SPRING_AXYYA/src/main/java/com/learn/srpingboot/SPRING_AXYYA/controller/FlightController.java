package com.learn.srpingboot.SPRING_AXYYA.controller;

import com.learn.srpingboot.SPRING_AXYYA.model.Flight;
import com.learn.srpingboot.SPRING_AXYYA.model.Passenger;
import com.learn.srpingboot.SPRING_AXYYA.service.FlightPassengerService;
import com.learn.srpingboot.SPRING_AXYYA.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightController {

    @Autowired
    FlightPassengerService flightPassengerService;

    @Autowired
    FlightService flightService;

    @RequestMapping("flightInfo")
    public List<Flight> flightInfo() {
        List<Flight> flightDeatails = flightService.flightDetails();
        return flightDeatails;
    }

    @GetMapping("/passengers")
    public  List<Passenger> printPassengers() {
        return flightPassengerService.getPassengers();
    }

  /*  @GetMapping("/male/passenger") // http://localhost:8080/male/passenger?gender=Female&destination=Delhi
    public List<Passenger> getMalePassenger(@RequestParam("gender") String gender,
                                            @RequestParam("destination") String destination) {
        return flightPassengerService.getGenderPassenger(gender, destination);
    }*/

    @GetMapping("/male/passenger/{gender}/{destination}") //http://localhost:8080/male/passenger/Female/Delhi
    public List<Passenger> getMalePassenger(@PathVariable("gender") String gender,
                                            @PathVariable("destination") String destination) {
        return flightPassengerService.getGenderPassenger(gender, destination);
    }

}
