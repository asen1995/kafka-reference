package com.asen.kafka.service;

import com.asen.kafka.in.PublishKafkaMessageRequest;
import com.asen.kafka.in.PublishKafkaMessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerServiceImpl implements KafkaProducerService {

    @Autowired
    @Qualifier("String-String")
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public PublishKafkaMessageResponse publishKafkaMessage(PublishKafkaMessageRequest publishKafkaMessageRequest) {

        String topic = publishKafkaMessageRequest.getTopic();
        String message = publishKafkaMessageRequest.getMessage();

        for (int i = 0; i < 1_000_000; i++) {
            kafkaTemplate.send(topic, message + i);
        }

        PublishKafkaMessageResponse publishKafkaMessageResponse = new PublishKafkaMessageResponse();
        publishKafkaMessageResponse.setTopic(topic);
        publishKafkaMessageResponse.setStatus("published");


        return publishKafkaMessageResponse;
    }


	
}
