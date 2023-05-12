package com.example.demo.apiTest;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.controller.BookController;
import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@ExtendWith(SpringExtension.class)
@WebMvcTest(BookController.class)
public class ApiTest {
	@MockBean
	BookService bookService;
	@Autowired
	MockMvc mockMvc;
	@Autowired
	ObjectMapper mapper;
	
	@Test
	public void testSaveApi() throws JsonProcessingException, Exception {
		Book book1 = new Book();
		book1.setId(1);
		book1.setName("Test");
		book1.setAuthor("KIRAN");
		when(bookService.save(book1)).thenReturn(book1);
		
		mockMvc.perform(post("/book")
				.contentType(MediaType.APPLICATION_JSON)
				.content(mapper.writeValueAsString(book1)))
		.andExpect(status().isOk());
		
		
	}
	@Test
	public void testGetApi() throws Exception {
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
		
		mockMvc.perform(get("/book"))
		.andExpect(status().isOk());
		
		
	}

}
