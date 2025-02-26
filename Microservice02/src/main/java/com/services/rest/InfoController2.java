package com.services.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.services.service.InfoService;

@RestController
public class InfoController2 {
	
	@Autowired
	private InfoService service;
	
	@GetMapping("/getinformation")
	public String getInfo() {
		return service.info();
	}

}
