package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepo;

@Service
public class BookService {
	@Autowired
	BookRepo bookRepo;
	public Book saveBook(Book book) {
		return bookRepo.save(book);
	}
	public List<Book> getAllBook()
	{
		return bookRepo.get();
	}

}
