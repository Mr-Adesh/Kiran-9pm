package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
@Autowired
MsgProducer msgProducer;

@GetMapping("/send")
public String send()
{
	msgProducer.sendMsg("Hi Kiran, hows the day");
	return "Send successfully";
	}
}
