package com.example.swaggerdemo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "user", description = "Rest API for user operations", tags = "User API")
public class MyController {

	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET, produces = "application/json")
	@ApiOperation(value = "Display greeting message to non-admin user", response = Greeting.class)
	public Greeting message(@PathVariable String name) {
		Greeting msg = new Greeting(name, "Hello " + name);
		return msg;
	}
}
