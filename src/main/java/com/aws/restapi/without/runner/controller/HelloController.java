package com.aws.restapi.without.runner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aws.restapi.without.runner.model.MessageResponse;

@RestController
@RequestMapping("/api")
public class HelloController {

	@GetMapping("/hello")
	public MessageResponse sayHello(@RequestParam(defaultValue = "Lambda World") String name) {
		return new MessageResponse("Hello, " + name + "!");
	}

	@PostMapping("/greet")
	public MessageResponse greet(@RequestBody MessageResponse request) {
		return new MessageResponse("No runner needed for, " + request.getMessage());
	}
}