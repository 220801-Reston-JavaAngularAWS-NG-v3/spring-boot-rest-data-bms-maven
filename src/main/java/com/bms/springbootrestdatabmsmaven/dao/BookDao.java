package com.bms.springbootrestdatabmsmaven.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bms.springbootrestdatabmsmaven.exception.ApplicationException;
import com.bms.springbootrestdatabmsmaven.pojo.BookPojo;
import com.bms.springbootrestrestbmsmaven.entity.BookEntity;

@Repository
public interface BookDao extends JpaRepository<BookEntity, Integer>{

	// can keep this interface emtpy and spring data jpa will provide the implemntation for the basic crud operation on the book_details table
		// save, update, delete, find
	
	// if you want to work with cutomized queries(other than the crud queries),  write finder methods
	// SELECT * from book_details WHERE book_genre='Fiction';
	public List<BookEntity> findByBookGenre(String bookGenre);

	
	// to work with customized queries
	// 1. finder methods
	// 2. JPQL - Java Persitence Querying Language, @Query annotations
	// 3. Criteria Queries
}
