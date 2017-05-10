package com.rcmutha.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/testing")
	public String index() {
		return "Welcome to the home page of testing!";
	}
}
