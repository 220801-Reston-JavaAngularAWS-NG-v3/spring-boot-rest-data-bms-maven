package com.bms.springbootrestdatabmsmaven.pojo;

import javax.validation.constraints.NotNull;

import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class BookPojo {

	private int bookId;
	
	@NotNull
	private String bookTitle;
	
	@NotNull
	private String bookAuthor;
	
	@NotNull
	private String bookGenre;
	
	@NotNull
	private Integer bookCost;
	
	private String bookImageUrl; // this is not very useful while working with a console based application
	
}
