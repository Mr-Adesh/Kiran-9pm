package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.model.Book;
import com.example.demo.controller.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bookService;
	@PostMapping("/book")
	public Book post(@RequestBody Book book) {
		return bookService.save(book);		
	}
	@GetMapping("/books")
	public List<Book> getBook() {
		return bookService.getBooks();
	}
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book) {
		 
		 return bookService.update(book);
	}
	@DeleteMapping("/books")
	public ResponseEntity deleteAll() {
		 bookService.deleteAll();
		 return new ResponseEntity("All Data Cleared", HttpStatusCode.valueOf(204));
	}
}
