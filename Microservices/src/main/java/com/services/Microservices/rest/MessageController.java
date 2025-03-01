package com.services.Microservices.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@Value("${msg}")
	private String msg;

	@GetMapping("/get-msg")
	public String getMessage() {
		return msg;
	}

}
