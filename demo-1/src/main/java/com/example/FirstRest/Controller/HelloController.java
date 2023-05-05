package com.example.FirstRest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	User user;
	@GetMapping("/Hi")
	public User get()
	{
		user.setName("Kiran");
		user.setRollNo("123");
		return user;
	}

}
