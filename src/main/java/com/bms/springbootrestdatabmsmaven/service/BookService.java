package com.bms.springbootrestdatabmsmaven.service;

import java.util.List;

import com.bms.springbootrestdatabmsmaven.exception.ApplicationException;
import com.bms.springbootrestdatabmsmaven.pojo.BookPojo;

public interface BookService {
	// C - Create
	// R - Read
	// U - Update
	// D - Delete
	
	// fetches all the books - Read
	List<BookPojo> getAllBooks();
	
	// adds a new book - Create
	BookPojo addBook(BookPojo bookPojo);
	
	// updates an existing book - Update
	BookPojo updateBook(BookPojo bookPojo);
	
	// deletes an existing book - Delete
	void deleteBook(int bookId);
	
	// fetches a book - Read
	BookPojo getABook(int bookId);
	
}
