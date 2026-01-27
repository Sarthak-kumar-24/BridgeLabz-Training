package com.annotations.implementcustomserializationannotationJsonField;

import java.lang.reflect.Field;

class User {

	@JsonField(name = "user_name")
	private String username;

	@JsonField(name = "user_age")
	private int age;

	@JsonField(name = "email_id")
	private String email;

	// Constructor
	public User(String username, int age, String email) {
		this.username = username;
		this.age = age;
		this.email = email;
	}
}
