package com.docker.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringDockerApplication {
	
	@GetMapping("/Message")
	public String message() {
		return "Hello Sureh, Welcome to Spring With Docker..";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerApplication.class, args);
	}

}
