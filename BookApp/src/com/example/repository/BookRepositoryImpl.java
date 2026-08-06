package com.example.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Book;

public class BookRepositoryImpl implements BookRepository {
	
	// Create Collection Object
	//List<Book> bookList =new ArrayList<>();
	Map<Integer, Book> map = new HashMap<>();

	@Override
	public Book addBook(Book book) {
		
//		boolean b= bookList.add(book);
//		if(b) {
//			return book;
//		} else {
//			return null;
//		}
		
		Book b=map.put(book.getId(), book);
		System.out.println("Added book in repository!");
		return b;
	}

	@Override
	public void deleteBook(int id) {
		// Get book object using id
		Book b=map.remove(id);
		
		if(b==null) {
			// through custom exception
			// throw new BookNotFoundException("Book not found with id: "+ id):
		}
		
		

	}

	@Override
	public void deleteBook(String title) {
		
	}

	@Override
	public Book updateBook(int id, Book updatedBook) {
		
		return null;
	}

	@Override
	public Book getBookById(int id) {
		
		return null;
	}

	@Override
	public Book getBookByTitle(String title) {
		
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

}
