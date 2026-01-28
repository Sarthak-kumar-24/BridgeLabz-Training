package com.jsonfilehandling.readaJSONfileandextractonlyspecificfields;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

//------------------------------------------------------------
//Program Name : ReadJSONSpecificFields
//Description  : Reads a JSON file and extracts only specific
//           fields (name and email) using Core Java.
//Author       : Your Name
//------------------------------------------------------------

public class ReadJSONSpecificFields {

	public static void main(String[] args) {

		try {
			// Step 1: Read the JSON file line by line
			// Load JSON file from resources folder
			InputStream is = ReadJSONSpecificFields.class.getClassLoader().getResourceAsStream("JSONFiles/users.json"
					+ "");
			if (is == null) {
				throw new RuntimeException("users.json not found in resources");
			}
			// Convert InputStream to String
			String jsonText = new String(is.readAllBytes(), StandardCharsets.UTF_8);

			JSONObject jsonObject = new JSONObject(jsonText);
			JSONArray users = jsonObject.getJSONArray("users");

			for (int i = 0; i < users.length(); i++) {
				JSONObject user = users.getJSONObject(i);

				System.out.println("Name  : " + user.getString("name"));
				System.out.println("Email : " + user.getString("email"));
				System.out.println("------------");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
