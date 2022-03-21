package com.example.Teamazure.Teamazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TeamazureApplication {
	@GetMapping("/gcp")
	public String message() {
		return "GCP App Engine Service - Build & Deployed Successfully using GCP Pipeline";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TeamazureApplication.class, args);
	}

}
