package com.jsonfilehandling.parseJSONandfilteronlythoserecordswhereagegreater;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

//------------------------------------------------------------
//Program Name : FilterJSONByAge
//Description  : Reads a JSON file, parses records, and prints
//           only those records where age > 25.
//Author       : Your Name
//------------------------------------------------------------

public class FilterJSONByAge {

	public static void main(String[] args) {

		try {
			// Load JSON from resources
			InputStream is = FilterJSONByAge.class.getClassLoader().getResourceAsStream("JSONFiles/users.json");

			if (is == null) {
				System.out.println("users.json not found");
				return;
			}

			// Convert InputStream to String
			String jsonText = new String(is.readAllBytes(), StandardCharsets.UTF_8);

			// Parse JSON
			JSONObject jsonObject = new JSONObject(jsonText);
			JSONArray usersArray = jsonObject.getJSONArray("users");

			// Filter users older than 25
			for (int i = 0; i < usersArray.length(); i++) {
				JSONObject user = usersArray.getJSONObject(i);

				int age = user.getInt("age");

				if (age > 25) {
					System.out.println("Name  : " + user.getString("name"));
					System.out.println("Age   : " + age);
					System.out.println("Email : " + user.getString("email"));
					System.out.println("-------------");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
