package com.example.entity;

// POJO  classes
public class Book {

	// Fields
	private int id;
	private String title;
	private String description;
	private double price;
	private String author;
	private String publisher;
	private int quantity;

	// public Constructors
	// No arg constructor
	public Book() {
	}

	public Book(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	// parameterized constructor
	public Book(int id, String title, String description, double price, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	// public Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	// public toString
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", description=" + description + ", price=" + price + ", author="
				+ author + ", publisher=" + publisher + ", quantity=" + quantity + "]";
	}


}
