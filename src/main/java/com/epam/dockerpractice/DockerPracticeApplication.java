package com.epam.dockerpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerPracticeApplication.class, args);
	}

	@GetMapping("/")
	public String getStatus(){
		return "Application is up and running";
	}
}
