package com.services.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="Microservice01")
public interface FeignClientService {

	@GetMapping("/info")
	public String info();
}
