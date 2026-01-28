package com.jsonfilehandling.readaJSONfileandprintallkeysandvalues;

import org.json.JSONObject;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;

//------------------------------------------------------------
//Program Name : ReadJSONPrintKeysValues
//Description  : Reads a JSON file and prints all keys
//           and their corresponding values using
//           Core Java (no libraries).
//Author       : Your Name
//------------------------------------------------------------

public class ReadJSONPrintKeysValues {

	public static void main(String[] args) {

		try {
			// Load JSON file from resources
			InputStream is = ReadJSONPrintKeysValues.class.getClassLoader().getResourceAsStream("JSONFiles/users.json");

			if (is == null) {
				System.out.println("JSON file not found");
				return;
			}

			// Convert InputStream to String
			String jsonText = new String(is.readAllBytes(), StandardCharsets.UTF_8);

			// Convert String to JSONObject
			JSONObject jsonObject = new JSONObject(jsonText);

			// Get all keys and print key = value
			Iterator<String> keys = jsonObject.keys();

			while (keys.hasNext()) {
				String key = keys.next();
				Object value = jsonObject.get(key);

				System.out.println(key + " = " + value);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
