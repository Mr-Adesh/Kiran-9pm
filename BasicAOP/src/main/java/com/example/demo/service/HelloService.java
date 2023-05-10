package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	public String hello()
	{
		return "Hello";
	}
	public void save()
	{
		System.out.println("Saving HELLO");
	}
	public void ex() throws Exception
	{
		throw new Exception("I am Exception");
	}

}
