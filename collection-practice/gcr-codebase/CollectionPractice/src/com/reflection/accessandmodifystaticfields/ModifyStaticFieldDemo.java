package com.reflection.accessandmodifystaticfields;

import java.lang.reflect.Field;

/*
 * ModifyStaticFieldDemo
 * ---------------------
 * Demonstrates accessing and modifying
 * a private static field using Reflection.
 */
public class ModifyStaticFieldDemo {

	public static void main(String[] args) {

		try {
			// Load Configuration class
			Class<?> cls = Configuration.class;

			// Access private static field 'API_KEY'
			Field apiKeyField = cls.getDeclaredField("API_KEY");

			// Disable access checks
			apiKeyField.setAccessible(true);

			// Modify static field (object reference = null)
			apiKeyField.set(null, "NEW_SECRET_API_KEY");

			// Retrieve and print updated value
			String updatedKey = (String) apiKeyField.get(null);

			System.out.println("Updated API_KEY: " + updatedKey);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
