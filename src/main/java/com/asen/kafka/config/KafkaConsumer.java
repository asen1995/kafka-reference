package com.asen.kafka.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
	
	@KafkaListener(topics = "AsenTopic", groupId = "simpleStringMessageGroupId")
	public void listenGroupSimpleStringMessageGroupId(String message) {
		System.out.println("Received Message in group id simpleStringMessageGroupId: " + message);
	}

}
