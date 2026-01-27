package com.reflection.generateJSONrepresentation;

import java.lang.reflect.Field;

/*
 * JsonUtil
 * --------
 * Converts an object to a JSON-like string using Reflection.
 */
public class JsonUtil {

	public static String toJson(Object obj) {

		if (obj == null) {
			return "null";
		}

		StringBuilder json = new StringBuilder();
		Class<?> cls = obj.getClass();

		json.append("{");

		Field[] fields = cls.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {

			Field field = fields[i];
			field.setAccessible(true); // access private fields

			try {
				String fieldName = field.getName();
				Object value = field.get(obj);

				json.append("\"").append(fieldName).append("\": ");

				// Handle value types
				if (value instanceof String) {
					json.append("\"").append(value).append("\"");
				} else {
					json.append(value);
				}

				// Add comma if not last field
				if (i < fields.length - 1) {
					json.append(", ");
				}

			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		}

		json.append("}");
		return json.toString();
	}
}
