package com.example.demo;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MsgConsumer {

@KafkaListener(topics = "test", groupId = "group")	
public void consume(ConsumerRecord<String, String> msg)
{
	System.out.println(msg.value());
	}
}
