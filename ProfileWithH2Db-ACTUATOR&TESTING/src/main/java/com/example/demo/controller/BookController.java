package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bookService;
	
	@PostMapping("/book")
	public Book save(@RequestBody Book book) {
		return bookService.save(book);
	}
	
	@GetMapping("/book")
	public List<Book> getBooks() {
		return bookService.getAllBooks();
	}

}
