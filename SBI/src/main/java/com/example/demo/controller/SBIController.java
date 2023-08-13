package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SBIController {
	@Value("${server.port}")
	String port;
	@GetMapping("/draw")
	public String widthdraw()
	{
		return "congrats! your money has been transfered"+ "--------"+port;
	}
	
	@GetMapping("/pay")
	public String clearOutStanding()
	{
		
		return "Congrats!! your outstanding has been cleared"+"--------"+port;
	}

}
