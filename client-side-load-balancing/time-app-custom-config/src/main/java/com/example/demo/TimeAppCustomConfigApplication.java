package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.config.RibbonTimeConfig;

@RestController
@RibbonClient(name = "time-service", configuration=RibbonTimeConfig.class)
@SpringBootApplication
public class TimeAppCustomConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeAppCustomConfigApplication.class, args);
	}
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping
	public String getTime() {
		return restTemplate.getForEntity("http://time-service", String.class).getBody();
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}

