package com.example.demo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.services.BookService;

@RestController
@RequestMapping(path="/api/v1")
public class BookContoller {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/books/{id}")
	public Book getById(@PathVariable("id") int id) {
		
		
		return this.bookService.getBookById(id);
		
	}
}
