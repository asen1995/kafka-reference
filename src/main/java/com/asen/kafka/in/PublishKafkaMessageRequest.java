package com.asen.kafka.in;

public class PublishKafkaMessageRequest {

	private String message;
	private String topic;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

}
