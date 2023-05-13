package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.exception.models.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value= {
			NotFoundException.class,
			IllegalArgumentException.class})
	@ResponseStatus(code = HttpStatus.CONFLICT)
	public @ResponseBody ErrorResponse handleNotFoundException(Exception exception) {
		return new  ErrorResponse(HttpStatus.CONFLICT.value(),exception.getMessage());
		
	}
	
	

}
