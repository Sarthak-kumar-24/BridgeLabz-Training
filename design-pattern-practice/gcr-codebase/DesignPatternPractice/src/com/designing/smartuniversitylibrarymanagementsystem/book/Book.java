package com.designing.smartuniversitylibrarymanagementsystem.book;

import java.util.List;

/**
 * Book class Built using Builder pattern because of optional attributes
 */
public class Book {

	// Required fields
	private final String title;

	// Optional fields
	private final List<String> authors;
	private final String edition;
	private final String genre;
	private final String publisher;

	// Private constructor
	private Book(BookBuilder builder) {
		this.title = builder.title;
		this.authors = builder.authors;
		this.edition = builder.edition;
		this.genre = builder.genre;
		this.publisher = builder.publisher;
	}

	// Static Builder class
	public static class BookBuilder {

		private final String title;
		private List<String> authors;
		private String edition;
		private String genre;
		private String publisher;

		public BookBuilder(String title) {
			this.title = title;
		}

		public BookBuilder authors(List<String> authors) {
			this.authors = authors;
			return this;
		}

		public BookBuilder edition(String edition) {
			this.edition = edition;
			return this;
		}

		public BookBuilder genre(String genre) {
			this.genre = genre;
			return this;
		}

		public BookBuilder publisher(String publisher) {
			this.publisher = publisher;
			return this;
		}

		public Book build() {
			return new Book(this);
		}
	}

	@Override
	public String toString() {
		return " Book: " + title + " | Edition: " + edition;
	}
}
