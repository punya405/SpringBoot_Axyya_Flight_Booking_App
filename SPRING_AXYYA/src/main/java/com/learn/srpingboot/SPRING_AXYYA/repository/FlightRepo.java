package com.learn.srpingboot.SPRING_AXYYA.repository;

import com.learn.srpingboot.SPRING_AXYYA.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FlightRepo extends JpaRepository<Flight, Long> {

}
