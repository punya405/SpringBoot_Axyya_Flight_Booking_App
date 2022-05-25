package com.learn.srpingboot.SPRING_AXYYA.controller;

import com.learn.srpingboot.SPRING_AXYYA.model.Booking;
import com.learn.srpingboot.SPRING_AXYYA.pojo.BookingDetails;
import com.learn.srpingboot.SPRING_AXYYA.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookingController {

    @Autowired
    BookingService bookingService;

    @RequestMapping("/getBookingInfo")
    public @ResponseBody List<Booking> getBookingInfo() {
        List<Booking> bookingInfo = bookingService.bookingInfo();
        System.out.println(bookingInfo);
        return bookingInfo;
    }

    @PostMapping("/saveBooking")
    public @ResponseBody ResponseEntity<Booking> saveBookings(@RequestBody BookingDetails bookingDetails) {
        Booking saveBookings = bookingService.saveBookings(bookingDetails);
        return ResponseEntity.ok(saveBookings);
    }
}
