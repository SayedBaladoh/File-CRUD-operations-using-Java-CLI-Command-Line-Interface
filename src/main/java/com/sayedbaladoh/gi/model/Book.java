package com.sayedbaladoh.gi.model;

public class Book {

	private int id;
	private String title;
	private String author;
	private String description;

	public Book() {
	}

	public Book(String title, String author, String description) {
		this.title = title;
		this.author = author;
		this.description = description;
	}

	public Book(int id, String title, String author, String description) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.description = description;
	}

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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", description=" + description + "]";
	}

	public String toRecord() {
		return id + " , " + title + " , " + author + " , " + description;
	}

}
