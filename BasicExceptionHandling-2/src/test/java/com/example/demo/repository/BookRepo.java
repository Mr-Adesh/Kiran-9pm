package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Book;

@Repository
public class BookRepo {
	List<Book> books = new ArrayList<>();
	public Book save(Book book) {
		books.add(book);
		return book;
	}
    public List<Book> get() {
		return books;
	}
	 

}
