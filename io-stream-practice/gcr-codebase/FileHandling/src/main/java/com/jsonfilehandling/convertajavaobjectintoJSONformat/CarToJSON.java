package com.jsonfilehandling.convertajavaobjectintoJSONformat;

import org.json.JSONObject;

//------------------------------------------------------------
//Program Name : CarToJSON
//Description  : Converts a Java Car object into JSON format
//             without using any external libraries.
//Author       : Your Name
//------------------------------------------------------------

public class CarToJSON {

	public static void main(String[] args) {

		// Create Car object
		Car car = new Car("Tesla", "Model 3", 2023, 50000);

		// Convert Car object to JSON
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("brand", car.brand);
		jsonObject.put("model", car.model);
		jsonObject.put("year", car.year);

		// Print JSON
		System.out.println(jsonObject.toString());
	}
}
