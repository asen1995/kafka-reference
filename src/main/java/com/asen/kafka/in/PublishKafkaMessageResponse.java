package com.asen.kafka.in;

public class PublishKafkaMessageResponse {
	private String topic;
	private String status;

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
