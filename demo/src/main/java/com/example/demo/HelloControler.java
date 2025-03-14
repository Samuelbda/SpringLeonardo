package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloControler {

	public static void main(String[] args) {
		SpringApplication.run(HelloControler.class, args);
	}
	
	@RestController public class HelloController  {
		@GetMapping("/test")
		public String helloWorld() {
		return "Hello, World!";
		}
		}

}
