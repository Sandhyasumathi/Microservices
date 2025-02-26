package com.services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class InfoService {

	@Autowired
	private FeignClientService service;
	public String info() {
//		RestTemplate template = new RestTemplate();
//		ResponseEntity<String> response = template.getForEntity("http://localhost:8081/info", String.class);
//		return response.getBody() + "from another controller";
		return service.info() + " coming from rest api";
	}
}
