package com.learn.srpingboot.SPRING_AXYYA.repository;

import com.learn.srpingboot.SPRING_AXYYA.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookingRepo extends JpaRepository<Booking, Long> {

}
