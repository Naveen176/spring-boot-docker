package com.nagarro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	@GetMapping("/")
	public String home() {
		return "SprigBoot-Docker-Deployment-Pipeline";
	}
}
