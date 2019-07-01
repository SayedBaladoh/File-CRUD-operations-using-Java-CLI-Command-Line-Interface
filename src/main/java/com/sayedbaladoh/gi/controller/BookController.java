package com.sayedbaladoh.gi.controller;

import com.sayedbaladoh.gi.service.ViewerService;
import com.sayedbaladoh.gi.service.ViewerServiceImpl;

/**
 * BookController
 * 
 * Allow user to navigate between different book manager options
 * 
 * @author Sayed Baladoh
 */
public class BookController {

	ViewerService viewerService = new ViewerServiceImpl();

	public void run() {

		// Load the database of books from disk, at application start time
		viewerService.load();

		int choice = viewerService.viewOptions();
		while (choice != 9) {
			switch (choice) {
			case 1:
				// View all books in the database
				viewerService.viewAll();
				break;
			case 2:
				// Add a new book
				viewerService.addBook();
				break;
			case 3:
				// Edit an existing book
				viewerService.editBook();
				break;
			case 4:
				// Remove an existing book
				viewerService.removeBook();
				break;
			case 5:
				// Search for books using keywords at title field
				viewerService.searchByTitle();
				// viewerService.search("title", sc, bookService);
				break;
			case 6:
				// Search for books using keywords at description field
				viewerService.searchByDescription();
				break;
			case 7:
				// Search for books using keywords at title or description
				// fields
				viewerService.searchByTitleOrDescription();
				break;
			case 8:
				// Save and Exit
				viewerService.saveAndExit();
				break;
			}
			choice = viewerService.viewOptions();
		}
		// Exit without save
		System.exit(0);
	}
}
