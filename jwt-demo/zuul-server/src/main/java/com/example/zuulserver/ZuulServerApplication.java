package com.example.zuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServerApplication.class, args);
	}

}

/*
curl -X POST http://localhost:8762/auth -H 'Content-Type: application/json' -H 'cache-control: no-cache' -d '{"username": "admin", "password": "12345" }'
curl -X GET http://localhost:8762/gallery -H 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGhvcml0aWVzIjpbIlJPTEVfQURNSU4iXSwiaWF0IjoxNTQ5Mzg2MTEwLCJleHAiOjE1NDk0NzI1MTB9.9yfNYBTe_pDmD9XQK2cVtEelNPgPwWZ0JshTJYvda9QjyCNwTqlnJ8w60wom106qn4IcL0U5wbCnpo8dR-RoMg' \
*/