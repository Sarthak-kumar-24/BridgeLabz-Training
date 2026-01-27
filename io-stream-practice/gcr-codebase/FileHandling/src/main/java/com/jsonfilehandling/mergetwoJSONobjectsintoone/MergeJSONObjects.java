package com.jsonfilehandling.mergetwoJSONobjectsintoone;

import org.json.JSONObject;

//------------------------------------------------------------
//Program Name : MergeJSONObjects
//Description  : Merges two JSON objects into one using
//             Core Java (no external libraries).
//Author       : Your Name
//------------------------------------------------------------

public class MergeJSONObjects {

	public static void main(String[] args) {

		// First JSON object
		JSONObject json1 = new JSONObject();
		json1.put("name", "Alice");
		json1.put("age", 25);

		// Second JSON object
		JSONObject json2 = new JSONObject();
		json2.put("email", "alice@example.com");
		json2.put("city", "Delhi");

		// Merge json2 into json1
		for (String key : json2.keySet()) {
			json1.put(key, json2.get(key));
		}

		// Final merged JSON
		System.out.println(json1.toString());
	}
}
