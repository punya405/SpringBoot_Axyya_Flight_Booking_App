package com.learn.srpingboot.SPRING_AXYYA.exception;

import com.learn.srpingboot.SPRING_AXYYA.pojo.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class CustomizedExceptionHandling extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BookingNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handleExceptions(BookingNotFoundException exception, WebRequest webRequest) {
        ExceptionResponse response = new ExceptionResponse();
        response.setLocalDateTime(LocalDateTime.now());
        response.setMessage("Booking not found | Booking Id is invalid");
        ResponseEntity<ExceptionResponse> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        return entity;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponse> handleExceptions(Exception exception, WebRequest webRequest) {
        ExceptionResponse response = new ExceptionResponse();
        response.setLocalDateTime(LocalDateTime.now());
        response.setMessage(exception.getMessage());
        ResponseEntity<ExceptionResponse> entity = new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        return entity;
    }

}
