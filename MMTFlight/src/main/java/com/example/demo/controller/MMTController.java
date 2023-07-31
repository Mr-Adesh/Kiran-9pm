package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Flight;

@RestController
public class MMTController {
@Autowired
RestTemplate restTemplate;

@GetMapping("/bestFlight")
public Flight getBestFlight()

{
	ResponseEntity<Flight[]>  l = restTemplate.getForEntity("http://localhost:1212/flight", Flight[].class);
	
	
	Flight flightWithLeastTime = l.getBody()[0];
	for (int i=1; i<l.getBody().length; i++) {
		Flight flight = l.getBody()[i];
		int time = flight.getDurationinHours();
		if (time < flightWithLeastTime.getDurationinHours()) {
			flightWithLeastTime = flight; 
		}
	}
	
	
	return flightWithLeastTime;
	}
}
