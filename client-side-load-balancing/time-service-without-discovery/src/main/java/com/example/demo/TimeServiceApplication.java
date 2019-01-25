package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TimeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeServiceApplication.class, args);
	}

	/*
	 * @Value("${server.port}") 
	 * private String port;
	 */

	@Autowired
	private Environment environment;

	@GetMapping
	public String getTime() {
		return "The current time is " + new Date().toString() + "(answered by service running on "
				+ environment.getProperty("local.server.port") + ")";
	}

}
