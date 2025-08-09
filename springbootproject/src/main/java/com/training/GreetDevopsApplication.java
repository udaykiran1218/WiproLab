package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GreetDevopsApplication {

	@GetMapping("/greet")
	public String sayHello(String name) {
		return "hi"+name+" welcome to Devops bootCamp!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(GreetDevopsApplication.class, args);
		System.out.println("hello uday");
		System.out.println("hello uday kiran");
	}

}
