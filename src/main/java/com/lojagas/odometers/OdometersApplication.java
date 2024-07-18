package com.lojagas.odometers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OdometersApplication {

	@GetMapping("/")
	String home() { return "Odometers Service";}
	public static void main(String[] args) {
		SpringApplication.run(OdometersApplication.class, args);
	}

}
