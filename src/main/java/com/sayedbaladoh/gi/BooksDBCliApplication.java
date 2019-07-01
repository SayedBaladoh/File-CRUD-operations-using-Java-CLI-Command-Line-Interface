package com.sayedbaladoh.gi;

import com.sayedbaladoh.gi.controller.BookController;

/**
 * BooksDBCliApplication
 * 
 * The entry point for Book Manager CLI Application
 *  
 * @author Sayed Baladoh
 */
public class BooksDBCliApplication {

	public static void main(String[] args) {

		BookController bookController = new BookController();
		bookController.run();

	}
}
