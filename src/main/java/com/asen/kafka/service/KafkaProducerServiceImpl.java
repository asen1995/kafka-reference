package com.asen.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.asen.kafka.in.PublishKafkaMessageRequest;
import com.asen.kafka.in.PublishKafkaMessageResponse;

@Service
public class KafkaProducerServiceImpl implements KafkaProducerService {

	@Autowired
	@Qualifier("String-String")
	private KafkaTemplate<String, String> kafkaTemplate;

	@Override
	public PublishKafkaMessageResponse publishKafkaMessage(PublishKafkaMessageRequest publishKafkaMessageRequest) {

		String topic = publishKafkaMessageRequest.getTopic();
		String message = publishKafkaMessageRequest.getMessage();

		kafkaTemplate.send(topic, message);

		PublishKafkaMessageResponse publishKafkaMessageResponse = new PublishKafkaMessageResponse();
		publishKafkaMessageResponse.setTopic(topic);
		publishKafkaMessageResponse.setStatus("published");
		return publishKafkaMessageResponse;
	}

}
