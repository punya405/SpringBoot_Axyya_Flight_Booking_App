package com.learn.srpingboot.SPRING_AXYYA.controller;

import com.learn.srpingboot.SPRING_AXYYA.exception.BookingNotFoundException;
import com.learn.srpingboot.SPRING_AXYYA.model.Booking;
import com.learn.srpingboot.SPRING_AXYYA.pojo.BookingDetails;
import com.learn.srpingboot.SPRING_AXYYA.pojo.BookingFlightPassenger;
import com.learn.srpingboot.SPRING_AXYYA.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/auth")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @RequestMapping("/getBookingInfo")
    public @ResponseBody ResponseEntity<List<Booking>> getBookingInfo() {
        List<Booking> bookingInfo = bookingService.bookingInfo();
        return ResponseEntity.ok(bookingInfo);
    }

    @PostMapping("/saveBooking")
    public @ResponseBody ResponseEntity<Booking> saveBookings(@RequestBody BookingDetails bookingDetails) {
        Booking saveBookings = bookingService.saveBookings(bookingDetails);
        return ResponseEntity.ok(saveBookings);
    }

    @GetMapping(value = "/bookingId/{bookingid}")
    public @ResponseBody ResponseEntity<BookingFlightPassenger> getFlightAndPassengerDetails(@PathVariable Long bookingid) {
        BookingFlightPassenger details = bookingService.getFlightAndPassengers(bookingid);
        return ResponseEntity.ok(details);
    }

    @GetMapping(value = "/exceptionHandler")
    public @ResponseBody ResponseEntity<List<Booking>> getExceptionHandler() {
        List<Booking> bookings = bookingService.bookingInfo();
        bookings.clear();
        if(bookings.isEmpty()){
            throw new BookingNotFoundException("");
        }
        return ResponseEntity.ok(bookings);
    }
}
