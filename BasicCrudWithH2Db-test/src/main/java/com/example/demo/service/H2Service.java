package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.MyRepository;

@Service
public class H2Service {
	@Autowired
	MyRepository myRepository;
	
public Book save(Book book) {
	return myRepository.save(book);
}
public List<Book> getAll() {
	return myRepository.findAll();
}
public void delete()
{
	myRepository.deleteAll();
}

}
