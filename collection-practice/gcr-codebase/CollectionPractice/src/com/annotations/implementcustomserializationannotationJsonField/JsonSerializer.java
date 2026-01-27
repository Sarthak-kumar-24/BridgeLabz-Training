package com.annotations.implementcustomserializationannotationJsonField;

import java.lang.reflect.Field;

public class JsonSerializer {

	// Converts any object into JSON string
	public static String toJson(Object obj) {

		StringBuilder json = new StringBuilder();
		json.append("{");

		Class<?> clazz = obj.getClass();
		Field[] fields = clazz.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {

			Field field = fields[i];
			field.setAccessible(true); // allow access to private fields

			// Process only fields annotated with @JsonField
			if (field.isAnnotationPresent(JsonField.class)) {

				JsonField annotation = field.getAnnotation(JsonField.class);
				String jsonKey = annotation.name();

				try {
					Object value = field.get(obj);

					json.append("\"").append(jsonKey).append("\": ");

					// Add quotes for String values
					if (value instanceof String) {
						json.append("\"").append(value).append("\"");
					} else {
						json.append(value);
					}

					json.append(", ");

				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}

		// Remove trailing comma and space
		if (json.charAt(json.length() - 2) == ',') {
			json.delete(json.length() - 2, json.length());
		}

		json.append("}");
		return json.toString();
	}

	public static void main(String[] args) {

		User user = new User("Sarthak", 21, "sarthak@gmail.com");

		String json = JsonSerializer.toJson(user);

		System.out.println(json);
	}

}
