package com.example;

import java.util.Scanner;

import com.example.entity.Book;
import com.example.service.BookServiceImpl;

public class Main {

	public static void main(String[] args) {

		// Create Scanner Object
		Scanner sc = new Scanner(System.in);

		System.out.println("Select any one option from below list");
		System.out.println("1. Book");
		System.out.println("2. User");
		System.out.println("3. Loan Record");

		// Read option selected by user
		int option = sc.nextInt();

		if (option == 1) {
			System.out.println("1. Add book");
			System.out.println("2. Update Book");
			System.out.println("3. Delete Book");
			int selectedOption = sc.nextInt();
			if (selectedOption == 1) {
				System.out.println("Enter book title");
				String title = sc.next();
				System.out.println("Enter book description");
				String desc = sc.next();
				// Create Book using details provided by user.
				System.out.println("Create Book");
				Book book =new Book(1001, title);
				
				//Call Service method
				   // Create BookServiceImpl obj
				   
				   BookServiceImpl bookService=new BookServiceImpl();
				   
				   // call book service method
				   System.out.println("Calling Book service add method!");
				   Book newBook=bookService.addBook(book);
				   System.out.println("Book is added successfully.");
			} else if(selectedOption==2) {
				
			} else {
				
			}

		} else if(option==2) {
			// user logic
		} else if(option==3){
			// loan book logic
		} else {
			// throw exception
		}

	}

}
