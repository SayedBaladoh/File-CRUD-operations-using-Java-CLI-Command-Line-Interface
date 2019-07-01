package com.sayedbaladoh.gi.service;

import java.util.List;

import com.sayedbaladoh.gi.model.Book;

/**
 * Service service
 * 
 * Different book operations
 * 
 * @author Sayed Baladoh
 */
public interface BookService {

	List<Book> loadAll();

	public List<Book> getAll();

	public Book get(int id);

	public List<Book> getByTitle(String keyword);

	public List<Book> getByDescription(String keyword);

	public List<Book> getByTitleOrDescription(String keyword);

	public String save(Book book);

	public String update(int id, String title, String author, String description);

	public String delete(int id);

	public Book get(List<Book> books, int id);

	/**
	 * Write the database of books to disk, upon exiting the application
	 */
	public boolean save();
}
