package com.scerra.jenkinspipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsPipelineApplication {
	@GetMapping
	public String message(){
		return "welcome spring boot jenkins demo project";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsPipelineApplication.class, args);
	}

}
