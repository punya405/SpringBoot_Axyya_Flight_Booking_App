package com.learn.srpingboot.SPRING_AXYYA.service;

import java.util.List;

import com.learn.srpingboot.SPRING_AXYYA.model.Booking;
import com.learn.srpingboot.SPRING_AXYYA.model.Flight;
import com.learn.srpingboot.SPRING_AXYYA.model.Passenger;
import com.learn.srpingboot.SPRING_AXYYA.pojo.BookingDetails;
import com.learn.srpingboot.SPRING_AXYYA.repository.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
	
	@Autowired
	BookingRepo bookingRepo;

	public List<Booking> bookingInfo() {
		List<Booking> findAll = bookingRepo.findAll();
		return findAll;
	}

	public Booking saveBookings(BookingDetails bookingDetails) {
		Booking booking = new Booking();
		Flight flight = bookingDetails.getFlight();
		List<Passenger> passengers = bookingDetails.getPassengers();
		booking.setFlight(flight);
		booking.setPassengers(passengers);
		booking.setBookingDate(bookingDetails.getBookingDate());
		booking.setNoOfPassengers(bookingDetails.getNoOfPassengers());
		Booking savedBooking = bookingRepo.save(booking);
		return savedBooking;
	}

}
