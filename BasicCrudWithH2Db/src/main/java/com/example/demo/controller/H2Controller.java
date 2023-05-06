package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.H2Service;

@RestController
@RequestMapping("/Book/")
public class H2Controller {
	@Autowired
    H2Service h2Service;
	@PostMapping("/test")	
	public Book saveBook(@RequestBody Book book)
	{
		return h2Service.save(book);
	}
	@GetMapping("/test")
	public List<Book> getAllBooks(){
		return h2Service.getAll();
	}
	@DeleteMapping("/del")
	public void deleteAll()
	{
		h2Service.delete();
	}
	@DeleteMapping("/delId")
	public void deleteById(@RequestParam(value = "id")Integer id)
	{
		h2Service.deleteById(id);
	}
}
