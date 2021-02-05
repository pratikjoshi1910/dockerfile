package com.example.token.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping(value = "/demo")
	
	public String getDemo()
	{
		return "demo"; 
	}
	

}
