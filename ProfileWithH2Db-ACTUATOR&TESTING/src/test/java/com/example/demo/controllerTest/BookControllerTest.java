package com.example.demo.controllerTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.controller.BookController;
import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@ExtendWith(MockitoExtension.class)
public class BookControllerTest {
	@Mock
	BookService bookService;
	
	@InjectMocks
	BookController bookController;
	
	@Test
	public void testSaveBook()
	{
		Book testbook = new Book();
		testbook.setId(1);
		testbook.setName("Test");
		testbook.setAuthor("KIRAN");
		when(bookService.save(testbook)).thenReturn(testbook);
		Book newBook = bookController.save(testbook);
		assertThat(newBook).isSameAs(testbook);
		verify(bookService, times(1)).save(testbook);
	}
	
	@Test
	public void testFindAll() {
		Book book1 = new Book();
		book1.setId(1);
		book1.setName("Test");
		book1.setAuthor("KIRAN");
		Book book2 = new Book();
		book2.setId(2);
		book2.setName("Test2");
		book2.setAuthor("KIRAN2");
		List<Book> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		when(bookService.getAllBooks()).thenReturn(books);
		List<Book> testList = bookController.getBooks();
		assertThat(testList).isSameAs(books);
		verify(bookService, times(1)).getAllBooks();
		
		
	}
	
	

}
