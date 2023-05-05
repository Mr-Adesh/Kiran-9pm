package com.annotation.webAnnotation.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public class User {
String name;
String location;

public User(String name, String location) {
	super();
	System.out.println("HELLO Kiran");
	this.name = name;
	this.location = location;
}

public String getName() {
	return name;
}

public String getLocation() {
	return location;
}

@Override
public String toString() {
	return "User [name=" + name + ", location=" + location + "]";
}

}
