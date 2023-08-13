package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KhanController {

	@GetMapping("/khan")
	public String getDosa()
	{
		return "Hi Kiran, i served a delicius karam Dosa";
	}
}
