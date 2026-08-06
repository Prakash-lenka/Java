package com.example.service;

import java.util.List;

import com.example.entity.Book;

public interface BookService {
	
	// ADD
	Book addBook(Book book);
	
	// DELETE By Id
	void deleteBook(int id);
	
	// DELETE By title
	void deleteBook(String title);
	
	// UPDATE
	Book updateBook(int id, Book updatedBook);
	
	// GET By ID
	Book getBookById(int id);
	
	// GET By Name
	Book getBookByTitle(String title);
	
	// GET All
	List<Book> getAllBooks();

}
