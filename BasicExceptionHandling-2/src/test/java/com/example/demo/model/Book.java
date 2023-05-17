package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Book {
	String name;
	String author;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

}
