package com.aeon.loginbasicauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@SpringBootApplication
public class LoginBasicAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginBasicAuthApplication.class, args);
	}

	@GetMapping
	public ResponseEntity<String> helloWorld() {
		return ResponseEntity.status(HttpStatus.OK).body("Hello World!");
	}
}
