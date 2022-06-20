package com.ticket_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TicketServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(TicketServiceApp.class, args);
	}

}
