package com.sayedbaladoh.gi.connection;

import java.io.File;
import java.io.IOException;

/**
 * Create a file if it is not exist at the current user home directory or Return
 * it if exists
 * 
 * @author Sayed Baladoh
 *
 */
public class FileConnection {

	// static File file = null;

	public static File getFile() {
		// Get current user home directory
		String directory = System.getProperty("user.home");
		String fileName = "books.txt";
		String absolutePath = directory + File.separator + fileName;

		// System.out.println("absolutePath: " + absolutePath);

		// Using file pointer creating the file.
		File file = new File(absolutePath);

		if (!file.exists()) {
			// System.out.println("File Doesn't Exist");
			try {
				// Create a new file if not exists.
				file.createNewFile();
			} catch (IOException e) {
				// e.printStackTrace();
				System.out.println(e);
			}
		}

		return file;

	}

}
