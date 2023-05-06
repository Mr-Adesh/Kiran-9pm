package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic/")
public class BasicController {
	@GetMapping("/test")
	public String get()
	{
		return "Hello";
	}

}
