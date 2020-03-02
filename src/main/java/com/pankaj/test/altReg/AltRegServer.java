package com.pankaj.test.altReg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AltRegServer {
	
	public static void main(String[] args) {
		System.setProperty("spring.config.name", "reg-server");
		SpringApplication.run(AltRegServer.class, args);
	}
}
