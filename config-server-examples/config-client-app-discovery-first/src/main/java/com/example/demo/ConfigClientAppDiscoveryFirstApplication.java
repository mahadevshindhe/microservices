package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class ConfigClientAppDiscoveryFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientAppDiscoveryFirstApplication.class, args);
	}

	@Value("${message1}")
	private String message1;
	
	@Value("${message2}")
	private String message2;
	
	@GetMapping("/")
	public String getMessage() {
		return "message1: " + message1 +",  message2: " + message2;
	}

}

