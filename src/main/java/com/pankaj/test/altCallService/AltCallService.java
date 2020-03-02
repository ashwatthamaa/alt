package com.pankaj.test.altCallService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AltCallService {
	
	public static void main(String[] args) {
		System.setProperty("spring.config.name", "call-service");
		SpringApplication.run(AltCallService.class, args);
	}
}
