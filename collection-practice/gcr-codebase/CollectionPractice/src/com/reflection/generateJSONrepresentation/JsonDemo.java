package com.reflection.generateJSONrepresentation;

/*
 * JsonDemo
 * --------
 * Demonstrates JSON generation using Reflection.
 */
public class JsonDemo {

	public static void main(String[] args) {

		User user = new User(101, "Sarthak", "sarthak@example.com", true);

		String json = JsonUtil.toJson(user);
		System.out.println(json);
	}
}
