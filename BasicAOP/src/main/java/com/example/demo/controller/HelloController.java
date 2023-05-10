package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HelloService;

@RestController
public class HelloController {
	@Autowired
	HelloService helloService;
	@GetMapping("/test")
	public String getHello()
	{
		return helloService.hello();
	}
	@PostMapping("test")
	public void saveHello()
	{
		 helloService.save();
	}
	@GetMapping("/ex")
	public void getEx() throws Exception
	{
		 helloService.ex();
	}

}
