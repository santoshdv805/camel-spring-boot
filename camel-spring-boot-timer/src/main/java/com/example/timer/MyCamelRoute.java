package com.example.timer;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyCamelRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("timer:myTimer?period={{spring.camel.timer}}").routeId("hello") // Runs every 5 seconds
				.log("Hello from Apache Camel! {{spring.camel.env}}").to("stream:out");

		 
	}

}
