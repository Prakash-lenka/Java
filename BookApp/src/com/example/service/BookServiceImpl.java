package com.example.service;

import java.util.List;

import com.example.entity.Book;
import com.example.repository.BookRepositoryImpl;

public class BookServiceImpl implements BookService {
	
	// Create Repository instance
	BookRepositoryImpl bookRepository=new BookRepositoryImpl();

	@Override
	public Book addBook(Book book) {
		//Book book=bookRepository.addBook(book);
		// Call repository addBook method to add book to db/collection.
		System.out.println("Calling repository addBook() method");
		return bookRepository.addBook(book);
	}

	@Override
	public void deleteBook(int id) {
		bookRepository.deleteBook(id);
	}

	@Override
	public void deleteBook(String title) {
		bookRepository.deleteBook(title);

	}

	@Override
	public Book updateBook(int id, Book updatedBook) {
		// verify book is present in the db or not
		
		// if book is present, update
		return null;
	}

	@Override
	public Book getBookById(int id) {
		
		return bookRepository.getBookById(id);
	}

	@Override
	public Book getBookByTitle(String title) {
		
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		
		return null;
	}

}
