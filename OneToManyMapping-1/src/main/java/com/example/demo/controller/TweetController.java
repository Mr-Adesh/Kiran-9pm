package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Tweet;
import com.example.demo.service.TweeTService;

@RestController
public class TweetController {
	@Autowired
	TweeTService service;
	
	@PostMapping("/test")
	public String post(@RequestBody Tweet tweet) {
		return service.save(tweet);
	}

}
