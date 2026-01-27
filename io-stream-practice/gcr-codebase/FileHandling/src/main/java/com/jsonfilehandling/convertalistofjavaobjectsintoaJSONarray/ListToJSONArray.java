package com.jsonfilehandling.convertalistofjavaobjectsintoaJSONarray;

// Import List and ArrayList classes
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
//------------------------------------------------------------
//Program Name : ListToJSONArray
//Description  : Converts a list of Java objects into a
//             JSON array without using external libraries.
//Author       : Your Name
//------------------------------------------------------------

public class ListToJSONArray {

	public static void main(String[] args) {

		// Create a List to store Car objects
		List<Car> carList = new ArrayList<>();

		// Add Car objects to the list
		carList.add(new Car("Tesla", "Model 3", 2023));
		carList.add(new Car("BMW", "X5", 2022));
		carList.add(new Car("Audi", "A6", 2021));

		// Create ObjectMapper instance
		// ObjectMapper is used to convert Java objects to JSON
		ObjectMapper mapper = new ObjectMapper();

		try {
			// Convert List of Car objects into JSON array (String format)
			String jsonArray = mapper.writeValueAsString(carList);

			// Print the generated JSON array
			System.out.println(jsonArray);

		} catch (Exception e) {
			// Handle any conversion errors
			e.printStackTrace();
		}
	}

}
