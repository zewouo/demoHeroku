package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	@GetMapping("/home")
	public String welcome()
	{
	return "bienvenu à mon application";	
	}
}
