package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {
	@RequestMapping("/subscribe")
	public String getwelcomepage()
	{
	return "subscribe";	
	}
	@PostMapping("profile")
	public String getProfile()
	{
	return "profile";	
	}
}
