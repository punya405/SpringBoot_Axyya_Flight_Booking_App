package com.learn.srpingboot.SPRING_AXYYA.service;

import java.util.List;

import com.learn.srpingboot.SPRING_AXYYA.model.Flight;
import com.learn.srpingboot.SPRING_AXYYA.repository.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FlightService {
	
	@Autowired
	FlightRepo flightRepo;

	public List<Flight> flightDetails() {
		List<Flight> findAll = flightRepo.findAll();
		return findAll;
	}

}
