package com.jsonfilehandling.parseJSONandfilteronlythoserecordswhereagegreater;

// Import required Jackson classes for JSON parsing
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

// Import Iterator to loop through JSON array
import java.util.Iterator;

//------------------------------------------------------------
//Program Name : FilterJSONByAge
//Description  : Reads a JSON file, parses records, and prints
//           only those records where age > 25.
//Author       : Your Name
//------------------------------------------------------------

public class FilterJSONByAge {

	public static void main(String[] args) {

		// JSON array as String input
		String jsonData = "[" + "{ \"name\": \"Alice\", \"age\": 22, \"email\": \"alice@example.com\" },"
				+ "{ \"name\": \"Bob\", \"age\": 28, \"email\": \"bob@example.com\" },"
				+ "{ \"name\": \"Charlie\", \"age\": 30, \"email\": \"charlie@example.com\" }" + "]";

		// Create ObjectMapper instance
		// ObjectMapper is used to parse JSON into tree structure
		ObjectMapper mapper = new ObjectMapper();

		try {
			// Parse JSON string into JsonNode tree
			JsonNode rootNode = mapper.readTree(jsonData);

			// Loop through each element in the JSON array
			for (JsonNode node : rootNode) {

				// Extract age field from current JSON object
				int age = node.get("age").asInt();

				// Check condition: age greater than 25
				if (age > 25) {

					// Extract required fields
					String name = node.get("name").asText();
					String email = node.get("email").asText();

					// Print filtered record
					System.out.println("Name: " + name);
					System.out.println("Age: " + age);
					System.out.println("Email: " + email);
					System.out.println("---------------------");
				}
			}

		} catch (Exception e) {
			// Handle parsing or processing exceptions
			e.printStackTrace();
		}
	}

}
