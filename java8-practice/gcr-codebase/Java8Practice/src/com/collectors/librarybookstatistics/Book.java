package com.collectors.librarybookstatistics;

public class Book {

	String title;
	String genre;
	int pages;

	// Constructor
	Book(String title, String genre, int pages) {
		this.title = title;
		this.genre = genre;
		this.pages = pages;
	}

	// Getters
	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public int getPages() {
		return pages;
	}

}
