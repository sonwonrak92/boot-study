package com.team4.bootstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello~ 4team";
	}

}
