package com.example.demo.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.model.Book;
import com.example.demo.controller.repository.MyRepo;

@Service
public class BookService {
	@Autowired
	MyRepo myRepo;
	
	public Book save(Book book) {
		return myRepo.save(book);
	}
	public List<Book> getBooks() {
		return myRepo.findAll();
	}
	public void deleteAll() {
		 myRepo.deleteAll();
	}
	public Book update(Book book) {
		 return myRepo.save(book);
	}
	public Book patchBook(Book book) {
		 return myRepo.save(book);
	}

}
