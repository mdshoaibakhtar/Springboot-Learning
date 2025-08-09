package com.learning.springboot.Learning.Spring.Boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningSpringBootApplication {

	public static void main(String[] args) {
        System.out.println("Spring Boot Application Started");
		SpringApplication.run(LearningSpringBootApplication.class, args);
	}

}
