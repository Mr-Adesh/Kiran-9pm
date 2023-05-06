package com.example.demo.controller.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.controller.model.User;

@Repository
public class MyRepository {
	ArrayList<User> arrayList = new ArrayList<>();
	
	public String save(User user)
	{
		arrayList.add(user);
		return "User saved successfully";
	}
	
	
	public List<User> get() {
		return arrayList;
		
	}
	public String delete() {
		arrayList.clear();
		return "USERS Deleted successfully";
	}

}
