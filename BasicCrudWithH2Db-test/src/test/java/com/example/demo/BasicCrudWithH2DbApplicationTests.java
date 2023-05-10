package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Book;
import com.example.demo.repository.MyRepository;
import com.example.demo.service.H2Service;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class BasicCrudWithH2DbApplicationTests {
	
	@Mock
	MyRepository myRepository;
	
	H2Service h2Service;	
	@BeforeAll
	public void setup() {
		h2Service = new H2Service();
		
	}
	@Test
	public void testSaveBook() {
		Book book = new Book();
		book.setName("Courage");
		book.setAuthor("OSHO");
		Book newBook = h2Service.save(book);
		assertThat(newBook).isSameAs(book);
	}

}
