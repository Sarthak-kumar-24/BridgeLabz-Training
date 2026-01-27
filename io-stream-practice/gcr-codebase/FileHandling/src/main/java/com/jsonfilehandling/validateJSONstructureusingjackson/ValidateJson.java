package com.jsonfilehandling.validateJSONstructureusingjackson;

import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * This class is used to validate the structure of a JSON string
 * by mapping it to a predefined Java class using Jackson.
 */
public class ValidateJson {

	public static void main(String[] args) {

		String json = "{ \"name\": \"Alice\", \"age\": 25, \"email\": \"alice@example.com\" }";

		ObjectMapper mapper = new ObjectMapper();

		try {
			// Try mapping JSON to Java object
			User user = mapper.readValue(json, User.class);

			System.out.println(" JSON structure is valid");

		} catch (Exception e) {
			System.out.println(" Invalid JSON structure");
			e.printStackTrace();
		}
	}
}
