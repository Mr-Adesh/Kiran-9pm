package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepo;

@Service
public class BookService {
	@Autowired
	BookRepo bookRepo;
public Book save(Book book) {
	return bookRepo.save(book);
	} 
}
