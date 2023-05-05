package com.annotation.webAnnotation.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.annotation.webAnnotation.model.User;

@Configuration
public class Config {
	
	@Bean
	@Scope("prototype")
	public User getUser()
	{
		System.out.println("KIRAN");
		return new User("Kiran", "Delhi");
	}

}
