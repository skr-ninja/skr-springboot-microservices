package com.sunil.api.gatway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceFallbackController {

	@GetMapping("custService")
	public String custService() {
		
		return "Customer Service is down";
		
	}
	
	@GetMapping("prodService")
	public String prodService() {
		
		return "Product Service is down";
		
	}
}
