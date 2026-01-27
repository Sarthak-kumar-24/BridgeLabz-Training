package com.jsonfilehandling.createaJSONobjectforastudent;

import org.json.JSONArray;
import org.json.JSONObject;

//------------------------------------------------------------
//Program Name : CreateStudentJSON
//Description  : Creates a JSON object for a Student with
//             name, age, and subjects (array).
//Author       : Your Name
//------------------------------------------------------------

public class CreateStudentJSON {

	public static void main(String[] args) {

		// Create JSONObject
		JSONObject jsonObject = new JSONObject();

		// Add simple fields
		jsonObject.put("name", "Sarthak");
		jsonObject.put("age", 20);

		// Create JSONArray for subjects
		JSONArray subjectsArray = new JSONArray();
		subjectsArray.put("Maths");
		subjectsArray.put("Computer Science");
		subjectsArray.put("Physics");

		// Add array to JSONObject
		jsonObject.put("subjects", subjectsArray);

		// Print JSON object
		System.out.println(jsonObject.toString());
	}
}
