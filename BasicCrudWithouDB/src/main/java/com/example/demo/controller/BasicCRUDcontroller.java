package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.model.User;
import com.example.demo.controller.service.CRUDService;

@RestController
public class BasicCRUDcontroller {
	@Autowired
	CRUDService crudService;
	@PostMapping("/test")
	public ResponseEntity<User> save(@RequestHeader(value = "name")String name, @RequestHeader(value = "loc")String loc ) {
		User user = new User();
		user.setName(name);
		user.setLoc(loc);
		crudService.saveUser(user);
		return ResponseEntity.status(201).body(user);
		
	}
	@GetMapping("/test")
    public List<User> get() {
		return crudService.getAllUsers();
		
	}
	@DeleteMapping("/test")
    public ResponseEntity<String> delete() {
		
		crudService.deleteUsers();
		return ResponseEntity.status(204).body("DELETED");
		
	}
	
	

}
