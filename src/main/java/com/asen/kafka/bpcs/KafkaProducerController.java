package com.asen.kafka.bpcs;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.slf4j.MDC;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.asen.kafka.in.PublishKafkaMessageRequest;
import com.asen.kafka.in.PublishKafkaMessageResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(tags="KafkaProducerController")
@Produces({"application/json", "application/xml"})
@Path("/")
public class KafkaProducerController {

	
	@POST
	@Path("publishKafkaMessage")
	@ApiOperation(value = "publishKafkaMessage", notes = "publishKafkaMessage notes", response = PublishKafkaMessageResponse.class)
	@ApiResponses({
		@ApiResponse(code=200, message="200", response=PublishKafkaMessageResponse.class),
		@ApiResponse(code=400, message="400", response=PublishKafkaMessageResponse.class),
		@ApiResponse(code=500, message="500", response=PublishKafkaMessageResponse.class)
	})
	@RequestMapping(value = "publishKafkaMessage", method=RequestMethod.POST)
	public PublishKafkaMessageResponse publishKafkaMessage(@RequestBody PublishKafkaMessageRequest request) {
		
		return new PublishKafkaMessageResponse();
	}
	
}
