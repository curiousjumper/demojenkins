package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DemojenkinsApplication {

	
	@GetMapping("/info")
	public String msg()
	{
		return "hello world...";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemojenkinsApplication.class, args);
	}

}
