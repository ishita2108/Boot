package com.springSec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecController {
	@GetMapping(path="home")
	public String home() {
		return "home";
	}
	
	@GetMapping(path="clerk")
	public String clerk() {
		return "clerk";
	}
	
	@GetMapping(path="admin")
	public String admin() {
		return "admin";
	}
	
	@GetMapping(path="mgr")
	public String mgr() {
		return "mgr";
	}
	
}
