package com.services.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
	
	@GetMapping("/info")
	public String info() {
		return "Information sent";
	}

}
