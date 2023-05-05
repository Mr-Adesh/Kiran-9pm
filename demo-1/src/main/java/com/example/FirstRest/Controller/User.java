package com.example.FirstRest.Controller;

import org.springframework.stereotype.Component;

@Component
public class User {
String name;
String rollNo;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRollNo() {
	return rollNo;
}
public void setRollNo(String rollNo) {
	this.rollNo = rollNo;
}


}
