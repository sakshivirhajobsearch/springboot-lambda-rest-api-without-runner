package com.aws.restapi.without.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdaRestApiWithoutRunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaRestApiWithoutRunnerApplication.class, args);
		System.out.println("\n" + "No runner needed for Lambda" + "\n");
	}
}
