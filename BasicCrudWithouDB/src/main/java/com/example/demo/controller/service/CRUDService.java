package com.example.demo.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.model.User;
import com.example.demo.controller.repository.MyRepository;

@Service
public class CRUDService {
	@Autowired
	MyRepository myRepository;
	
	public String saveUser(User user) {
		return myRepository.save(user);		
	}
	
	public List<User> getAllUsers() {
		return myRepository.get();
	}
	public String deleteUsers()
	{
		return myRepository.delete();
	}
	

}
