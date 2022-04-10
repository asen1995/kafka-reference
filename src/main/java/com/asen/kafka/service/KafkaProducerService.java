package com.asen.kafka.service;

import com.asen.kafka.in.PublishKafkaMessageRequest;
import com.asen.kafka.in.PublishKafkaMessageResponse;

public interface KafkaProducerService {

	public abstract PublishKafkaMessageResponse publishKafkaMessage(
			PublishKafkaMessageRequest publishKafkaMessageRequest);
}
