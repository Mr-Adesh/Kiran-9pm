package com.example.demo.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "SBISERVICE")
public interface SbiService {

	@GetMapping("/draw")
	public String widthdraw();
	
	@GetMapping("/pay")
	public String clearOutStanding();

}