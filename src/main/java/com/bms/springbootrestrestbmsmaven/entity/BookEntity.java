package com.bms.springbootrestrestbmsmaven.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// lombok annotations
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

// JPA annotations
@Entity
@Table(name="book_details")
public class BookEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // this annotation is used because the primary key is	//an autogenerated column of type identity
	@Column(name="book_id")
	private int bookId;
	
	@Column(name="book_title")
	private String bookTitle;
	
	@Column(name="book_author")
	private String bookAuthor;
	
	@Column(name="book_genre")
	private String bookGenre;
	
	@Column(name="book_cost")
	private int bookCost;
	
	@Column(name="book_image_url")
	private String bookImageUrl;
	
}
