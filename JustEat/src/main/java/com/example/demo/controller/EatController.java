package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EatController {

	@Autowired
	RestTemplate restTemplate;
	
	@Value("${khan.url}")
	String url;
	
	@GetMapping("/eat")
	public String get()
	{
		return restTemplate.getForObject(url, String.class) + "from Client";
	}
}
