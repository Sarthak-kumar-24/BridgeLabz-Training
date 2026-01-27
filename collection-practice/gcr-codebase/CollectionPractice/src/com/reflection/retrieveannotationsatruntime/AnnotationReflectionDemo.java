package com.reflection.retrieveannotationsatruntime;

/*
 * AnnotationReflectionDemo
 * ------------------------
 * Retrieves annotation values at runtime.
 */
public class AnnotationReflectionDemo {

	public static void main(String[] args) {

		try {
			// Get Class object
			Class<Book> cls = Book.class;

			// Check if annotation is present
			if (cls.isAnnotationPresent(Author.class)) {

				// Retrieve annotation
				Author author = cls.getAnnotation(Author.class);

				// Display annotation value
				System.out.println("Author Name: " + author.name());
			} else {
				System.out.println("No Author annotation found.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
