package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MsgProducer {
	@Value("${topic.name.producer}")
	String topic;
	@Autowired
KafkaTemplate<String, String> kafkaTemplate;
	public void sendMsg(String msg)
	{
		kafkaTemplate.send(topic, msg);
	}
}
