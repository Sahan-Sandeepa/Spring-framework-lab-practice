package com.paf.lab_03.lab_03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Lab03Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab03Application.class, args);
	}
	@GetMapping("/")
	public String rootEndPoin() {
		String message = "Hi there, I'm form spring framework!";
		return message;
	}
}
