package com.example.helloworldsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class HelloWorldSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldSampleApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "HelloWorld";
	}
}
