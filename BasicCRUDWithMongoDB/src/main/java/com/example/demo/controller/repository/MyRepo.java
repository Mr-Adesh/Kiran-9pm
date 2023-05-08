package com.example.demo.controller.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.controller.model.Book;
@Repository
public interface MyRepo extends MongoRepository<Book, Integer> {

}
