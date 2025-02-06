package com.cs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootCronschedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCronschedulerApplication.class, args);
	}

}
