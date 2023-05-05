package com.annotation.webAnnotation.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.annotation.webAnnotation.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class HelloController {
@Autowired
public User user;
	@GetMapping("/greet")
	public User greetings() {

		return user;
	}
	

}
