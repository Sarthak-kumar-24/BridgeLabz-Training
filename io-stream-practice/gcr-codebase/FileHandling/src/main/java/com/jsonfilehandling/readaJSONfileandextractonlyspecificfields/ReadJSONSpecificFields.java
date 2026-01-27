package com.jsonfilehandling.readaJSONfileandextractonlyspecificfields;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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
			// Read entire JSON file as String
			String content = new String(Files.readAllBytes(Paths.get("user.json")));

			// Convert String to JSONObject
			JSONObject jsonObject = new JSONObject(content);

			// Extract specific fields
			String name = jsonObject.getString("name");
			String email = jsonObject.getString("email");

			// Print extracted values
			System.out.println("Name: " + name);
			System.out.println("Email: " + email);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
