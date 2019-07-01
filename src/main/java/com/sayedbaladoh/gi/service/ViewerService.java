package com.sayedbaladoh.gi.service;

/**
 * Viewer service
 * 
 * Display different app functions
 * 
 * @author Sayed Baladoh
 */
public interface ViewerService {

	void load();

	int viewOptions();

	void viewAll();

	void addBook();

	void editBook();

	void removeBook();

	void searchByTitle();

	void searchByDescription();

	void searchByTitleOrDescription();

	void saveAndExit();

}
