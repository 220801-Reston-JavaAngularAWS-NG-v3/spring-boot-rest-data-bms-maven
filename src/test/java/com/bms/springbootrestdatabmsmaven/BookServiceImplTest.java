package com.bms.springbootrestdatabmsmaven;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bms.springbootrestdatabmsmaven.dao.BookDao;
import com.bms.springbootrestdatabmsmaven.pojo.BookPojo;
import com.bms.springbootrestdatabmsmaven.service.BookService;
import com.bms.springbootrestdatabmsmaven.service.BookServiceImpl;
import com.bms.springbootrestrestbmsmaven.entity.BookEntity;

import static org.mockito.Mockito.when;

import java.util.Optional;


  
@ExtendWith(MockitoExtension.class)
public class BookServiceImplTest {

	@InjectMocks
	BookServiceImpl bookService;

	@Mock
	BookDao bookDao;
	
//	@Test
//	public void testGetABookWithoutMockito() {
//		int bookId = 13;
//		
//		BookPojo expectedPojo = new BookPojo(13, "Dragons of the Ocean", "Stilton", "Commedy", 33, "");
//		BookPojo actualPojo = null;
//		
//		BookService bookService = new BookServiceImpl();
//		
//		actualPojo = bookService.getABook(13); // here when i call a methodof the service layer, it in turn call a method of dao
//														// according to unit testing the method that we are testing should be tested in isolation
//		
//		assertEquals(expectedPojo, actualPojo); // in order for the assertion to check iof the book pojo are equal 
//													// we should override equals and hashcode methods in the BookPojo class
//	}
//	
	
	@Test
	public void testGetABookWithMockito() {
		
		// define the mockito rule here
		
		BookPojo dummyBookPojo = new BookPojo(13, "Dragons of the Ocean", "Stilton", "Commedy", 33, "");
		
		when(bookDao.findById(13)).thenReturn(Optional.of(new BookEntity(13, "Dragons of the Ocean", "Stilton", "Commedy", 33, "")));
		
		int bookId = 13;
		
		BookPojo expectedPojo = new BookPojo(13, "Dragons of the Ocean", "Stilton", "Commedy", 33, "");
		BookPojo actualPojo = null;
		
		// the stubbing in mockito was not working because of the below line
		// the bookService which is declared at the class level (annotated with @InjectMocks) should be used and not the local bookService created in the below line
		// so commenting the below line
		
		//BookService bookService = new BookServiceImpl();
		

		// the bookService declared at class level is used here
		actualPojo = bookService.getABook(13); // here when i call a methodof the service layer, it in turn call a method of dao
														// according to unit testing the method that we are testing should be tested in isolation
		
		assertEquals(expectedPojo.getBookId(), actualPojo.getBookId()); // in order for the assertion to check if the book pojo are equal 
													// we should override equals and hashcode methods in the BookPojo class
	}
}
