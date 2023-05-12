package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmpAddDto;
import com.example.demo.service.EMPADDService;

@RestController
public class EmpController {
	@Autowired
EMPADDService empaddService;
	@PostMapping("/test")
	public EmpAddDto postEmployee(@RequestBody EmpAddDto addDto) {
		return empaddService.save(addDto);
	}
}
