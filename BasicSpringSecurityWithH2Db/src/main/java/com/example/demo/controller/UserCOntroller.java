package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCOntroller {
	@GetMapping("/test")
	public String get()
	{
		return "<h1>Hello Security! Passed</h1>";
	}

}
