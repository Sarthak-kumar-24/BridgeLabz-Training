package com.reflection.createcustomobjectmapper;

import java.util.HashMap;
import java.util.Map;

/*
 * ObjectMapperDemo
 * ----------------
 * Demonstrates custom object mapping.
 */
public class ObjectMapperDemo {

	public static void main(String[] args) {

		// Create map with data
		Map<String, Object> data = new HashMap<>();
		data.put("id", 101);
		data.put("name", "Sarthak");
		data.put("email", "sarthak@example.com");

		// Convert Map -> User object
		User user = ObjectMapperUtil.toObject(User.class, data);

		// Display mapped object
		user.display();
	}
}
