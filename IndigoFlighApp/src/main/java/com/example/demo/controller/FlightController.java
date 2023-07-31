package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Flight;

@RestController
public class FlightController {
    @GetMapping("/flight")
	public List<Flight> getFlights()
	{
    	Flight f1 = new Flight();
    	f1.setName("Indigo");
    	f1.setDurationinHours(3);
    	Flight f2 = new Flight();
    	f2.setName("Vistara");
    	f2.setDurationinHours(2);
 
    	Flight f3 = new Flight();
    	f3.setName("SpiceJet");
    	f3.setDurationinHours(4);
    	
		return List.of(f1,f2,f3);
	}
}
