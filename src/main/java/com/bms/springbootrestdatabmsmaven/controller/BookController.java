package com.bms.springbootrestdatabmsmaven.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bms.springbootrestdatabmsmaven.exception.ApplicationException;
import com.bms.springbootrestdatabmsmaven.pojo.BookPojo;
import com.bms.springbootrestdatabmsmaven.service.BookService;
import com.bms.springbootrestdatabmsmaven.service.BookServiceImpl;

@CrossOrigin // this is to fix cors issue
@RestController
@RequestMapping("api/books")
public class BookController {

	//private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	// by autowiring we are telling the spring framework that search for a class that implements this interface(BookService)
		// and create an object of that class and assign it to this reference variable bookService
		// provided the class implementation is annotated with @Component or one of its stereotype annotation(@Service)
	@Autowired 
	BookService bookService;
	
	// write the 5 rest methods corresponding to the 5 endpoints
	
	// Read - getAllBooks - @GetMapping
	// http://localhost:6666/api/books - get
	@GetMapping("")
	public List<BookPojo> getAllBooks(){
		//logger.info("Entered getAllBooks() in controller layer...");
		// call the corresponding getAllBooks method of the service layer
		// for that we need to create an object of the service layer
		// but with spring framework we can tell the framework to create the object
		List<BookPojo> allBooks = bookService.getAllBooks();
		//logger.info("Exited getAllBooks() in controller layer...");
		return allBooks;

	}
	// Read - getABook - @GetMapping
	// http://localhost:6666/api/books/14
	// here we have 2 types of parmaters that can be sent through the url
		// query param
		// request param
	@GetMapping("/{bid}")
	public BookPojo getABook(@PathVariable("bid") int  bookId){
		//logger.info("Entered getABook() in controller layer...");
		//logger.info("Exited getABook() in controller layer...");
		return bookService.getABook(bookId);
	}
	
	// Create - addBook - @PostMapping
	@PostMapping("")
	public BookPojo addBook(@Valid @RequestBody BookPojo newBook){
		//logger.info("Entered addBook() in controller layer...");
		//logger.info("Exited addBook() in controller layer...");
		return bookService.addBook(newBook);
	}
	
	// Update - updateBook - @PutMapping
	@PutMapping("")
	public BookPojo updateBook(@RequestBody BookPojo updateBook){
		//logger.info("Entered updateBook() in controller layer...");
		//logger.info("Exited updateBook() in controller layer...");
		return bookService.updateBook(updateBook);
	}
	
	// Delete - deleteBook - @DeleteMapping
	@DeleteMapping("/{bid}")
	public void deleteBook(@PathVariable("bid") int bookId){
		//logger.info("Entered deleteBook() in controller layer...");
		bookService.deleteBook(bookId);
		//logger.info("Entered deleteBook() in controller layer...");
	}
}
