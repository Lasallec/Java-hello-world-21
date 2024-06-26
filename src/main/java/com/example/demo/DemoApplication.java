package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplication {

	@GetMapping("/")
	public String index() {
		return "baconcheeseburger with fries please!";
	}
	public ResponseEntity<String> healthCheck() {
		return ResponseEntity.ok().build();
	}
	@GetMapping ("/actuator/health")
	public String health() {
		return "Success";
	}
}
