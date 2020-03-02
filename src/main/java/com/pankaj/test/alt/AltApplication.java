package com.pankaj.test.alt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AltApplication {

	public static void main(String[] args) {
		String profiles = System.getProperty("spring.profiles.active");
		if(profiles==null || profiles.isEmpty()) {
			System.setProperty("spring.profiles.active", "local");
			System.err.println("Setting to local");
		}
		System.setProperty("spring.config.name", "person-service");
		SpringApplication.run(AltApplication.class, args);
	}

}
