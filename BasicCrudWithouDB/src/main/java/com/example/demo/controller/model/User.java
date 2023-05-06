package com.example.demo.controller.model;

import org.springframework.stereotype.Component;

@Component
public class User {
	String name;
	String loc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	

}
