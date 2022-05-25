package com.learn.srpingboot.SPRING_AXYYA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class HelloController {
	
	String str = "Welcome to Spring Boot!";
	
	@GetMapping("/hello")
	public @ResponseBody String sayHelloWorld() {
		return str;
	}
	
	@GetMapping("/hellouser")
	public @ResponseBody String sayHelloUser() {
		return "Hello User!";
	}
	
	
	// Passengers of flight
	

}
