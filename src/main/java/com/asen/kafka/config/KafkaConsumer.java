package com.asen.kafka.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
	
	@KafkaListener(topics = "AsenTopic", groupId = "initGroupId")
	public void listenGroupInitGroupId(String message) {
		System.out.println("Received Message in group id initGroupId: " + message);
	}

}
