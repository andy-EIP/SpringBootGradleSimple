package com.simple.juni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
	scanBasePackages = {
		"com.simple.juni.restful",
		"com.simple.juni.controller",
		"com.simple.juni.security.controller",
		"com.simple.juni.security.service"
	})
public class JuniApplication {

	public static void main(String[] args) {
		SpringApplication.run(JuniApplication.class, args);
	}

}
