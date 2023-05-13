package com.example.demo.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

public class NotFoundException extends RuntimeException {
	public NotFoundException() {
		super("Id not found");
		// TODO Auto-generated constructor stub
	}
	

}
