CREATE DATABASE book_management_system;

\c book_management_system;

CREATE TABLE book_details(book_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
						  book_title VARCHAR(100) NOT NULL,
						  book_author VARCHAR(100) NOT NULL,
						  book_genre VARCHAR(50) NOT NULL,
						  book_cost INT NOT NULL,
						  book_image_url VARCHAR(255));
						  
						  