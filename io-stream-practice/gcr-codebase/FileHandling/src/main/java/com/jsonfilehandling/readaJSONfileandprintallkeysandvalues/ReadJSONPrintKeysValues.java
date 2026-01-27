package com.jsonfilehandling.readaJSONfileandprintallkeysandvalues;

// Import required classes for file reading
import java.io.File;
import java.util.Iterator;
import java.util.Map;

// Import Jackson classes for JSON processing
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

//------------------------------------------------------------
//Program Name : ReadJSONPrintKeysValues
//Description  : Reads a JSON file and prints all keys
//           and their corresponding values using
//           Core Java (no libraries).
//Author       : Your Name
//------------------------------------------------------------

public class ReadJSONPrintKeysValues {

	public static void main(String[] args) {

		// Create ObjectMapper instance
		// ObjectMapper is the main class used for JSON parsing in Jackson
		ObjectMapper mapper = new ObjectMapper();

		try {
			// Read JSON file and convert it into JsonNode (tree structure)
			JsonNode rootNode = mapper.readTree(new File("data.json"));

			// Get an iterator for all fields (key-value pairs) in the JSON object
			Iterator<Map.Entry<String, JsonNode>> fields = rootNode.fields();

			// Loop through each key-value pair
			while (fields.hasNext()) {

				// Get the current field (key-value pair)
				Map.Entry<String, JsonNode> field = fields.next();

				// Extract key
				String key = field.getKey();

				// Extract value
				JsonNode value = field.getValue();

				// Print key and value
				System.out.println("Key: " + key + ", Value: " + value.asText());
			}

		} catch (Exception e) {
			// Handle file reading or JSON parsing errors
			e.printStackTrace();
		}
	}

}
