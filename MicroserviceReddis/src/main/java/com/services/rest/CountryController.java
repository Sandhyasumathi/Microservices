package com.services.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.services.model.Country;
import com.services.service.CountryService;

@RestController
public class CountryController {
	
	@Autowired
	private CountryService service;
	
	@PostMapping("/addCountry")
	public String saveCountry(@RequestBody Country country) {
		return service.addCountry(country);
	}
	

}
