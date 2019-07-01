package com.sayedbaladoh.gi.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.sayedbaladoh.gi.connection.FileConnection;
import com.sayedbaladoh.gi.model.Book;

/**
 * Service service Implementation
 * 
 * Different book operations
 * 
 * @author Sayed Baladoh
 */
public class BookServiceImpl implements BookService {

	File file = FileConnection.getFile();

	private List<Book> books = new ArrayList<>();

	/**
	 * Load all books from the disk file
	 *
	 * @return List of loaded books
	 */
	@Override
	public List<Book> loadAll() {

		try {
			Scanner reader = new Scanner(file);
			// reader.skip("[\r\n]*");
			reader.useDelimiter(" , |\n");

			int id;
			String title, author, description;

			// For each book in the file's list
			while (reader.hasNext()) {

				// id = reader.nextInt();
				id = Integer.parseInt(reader.next());
				reader.skip("[\r\n]*");
				title = reader.next();
				author = reader.next();
				description = reader.next().replaceAll("[\r\n]+", "");
				books.add(new Book(id, title, author, description));
			}

		} catch (FileNotFoundException e) {
			System.out.println("Sorry, Error: " + e);
		}

		return books;
	}

	/**
	 * Return all books
	 */
	@Override
	public List<Book> getAll() {
		return books;
	}

	/**
	 * Add a new book
	 */
	@Override
	public String save(Book book) {

		int id = books.size() > 0 ? books.get(books.size() - 1).getId() + 1 : 1;

		book.setId(id);

		books.add(book);

		return "Book [" + book.getId() + "] Saved";
	}

	/**
	 * Edit an existing book
	 */
	@Override
	public String update(int id, String title, String author, String description) {
		for (Book book : books) {
			if (book.getId() == id) {
				if (!title.isEmpty())
					book.setTitle(title);
				if (!author.isEmpty())
					book.setAuthor(author);
				if (!description.isEmpty())
					book.setDescription(description);
				break;
			}
		}

		return "Book [" + id + "] Updated";

	}

	/**
	 * Remove an existing book
	 */
	@Override
	public String delete(int id) {
		for (Book book : books) {
			if (book.getId() == id) {
				books.remove(book);
				break;
			}
		}

		return "Book [" + id + "] Deleted";

	}

	/**
	 * Get an existing book by id
	 * 
	 * @param id
	 * @return
	 */
	public Book get1(int id) {
		for (Book book : books) {
			if (book.getId() == id) {
				return book;
			}
		}
		return null;
	}

	/**
	 * Find a book by id
	 */
	@Override
	public Book get(int id) {
		return books.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
	}

	/**
	 * Filter books by title
	 */
	@Override
	public List<Book> getByTitle(String keyword) {
		return books.stream().filter(b -> b.getTitle().toLowerCase().contains(keyword.toLowerCase()))
				.collect(Collectors.toList());
	}

	/**
	 * Filter books by description
	 */
	@Override
	public List<Book> getByDescription(String keyword) {
		return books.stream().filter(b -> b.getDescription().toLowerCase().contains(keyword.toLowerCase()))
				.collect(Collectors.toList());
	}

	/**
	 * Filter books by title or description
	 */
	@Override
	public List<Book> getByTitleOrDescription(String keyword) {
		return books.stream()
				.filter(b -> b.getTitle().toLowerCase().contains(keyword.toLowerCase())
						|| b.getDescription().toLowerCase().contains(keyword.toLowerCase()))
				.collect(Collectors.toList());
	}

	/**
	 * Filter a list of books by id
	 */
	@Override
	public Book get(List<Book> books, int id) {
		return books.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
	}

	/**
	 * Write the database of books to disk, upon exiting the application
	 */
	@Override
	public boolean save() {

		if (books.isEmpty() || !file.exists()) {
			return false;
		} else {
			PrintWriter writer;
			try {
				writer = new PrintWriter(file);

				for (Book book : books) {
					writer.println(book.toRecord());
				}
				writer.flush();
				writer.close();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			return true;
		}
	}

}
