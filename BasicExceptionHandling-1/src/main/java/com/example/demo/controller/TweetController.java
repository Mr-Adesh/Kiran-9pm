package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.NotFoundException;
import com.example.demo.exception.models.ErrorResponse;
import com.example.demo.model.Tweet;
import com.example.demo.service.TweeTService;

@RestController
public class TweetController {
	@Autowired
	TweeTService service;
	
	@PostMapping("/test")
	public String post(@RequestBody Tweet tweet) {
		throw new IllegalArgumentException("Hey it is Illegal");
		//return service.save(tweet);
	}
	
	@GetMapping("/test")
	public Tweet getTweet(@RequestParam(name = "id") int id ) {
		Tweet tweet = service.getTweet(id);
		if(tweet.getTitle()==null) {
			throw new NotFoundException();
		}
		return service.getTweet(id);
	}
	
//	@ExceptionHandler(value= NotFoundException.class)
//	@ResponseStatus(code = HttpStatus.CONFLICT)
//	public ErrorResponse handleNotFoundException(NotFoundException exception) {
//		return new  ErrorResponse(HttpStatus.CONFLICT.value(),exception.getMessage());
//		
//	}
	
	
	
	

}
