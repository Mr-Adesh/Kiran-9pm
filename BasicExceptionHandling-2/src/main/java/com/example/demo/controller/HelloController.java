package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/test")
public String getMsg() {
	return "Hello Security";
}
	@PostMapping("/t")
public String getPost() {
	return "Hello Security Post";
}
}
