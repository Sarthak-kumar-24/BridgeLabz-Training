package com.jsonfilehandling.convertJSONtoXMLformat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Import Jackson ObjectMapper for JSON processing
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

// Import XmlMapper for XML conversion
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

//------------------------------------------------------------
//Program Name : JSONToXML
//Description  : Converts a simple JSON file into XML format
//           using Core Java (no Maven, no libraries).
//Author       : Your Name
//------------------------------------------------------------

public class JSONToXML {

	public static void main(String[] args) {

		try {
			// JSON input as String
			String jsonData = "{ \"name\": \"Alice\", \"age\": 25, \"email\": \"alice@example.com\" }";

			// Create ObjectMapper instance for JSON parsing
			ObjectMapper jsonMapper = new ObjectMapper();

			// Parse JSON string into JsonNode tree
			JsonNode jsonNode = jsonMapper.readTree(jsonData);

			// Create XmlMapper instance for XML conversion
			XmlMapper xmlMapper = new XmlMapper();

			// Convert JsonNode into XML String
			String xmlOutput = xmlMapper.writeValueAsString(jsonNode);

			// Print the converted XML
			System.out.println(xmlOutput);

		} catch (Exception e) {
			// Handle JSON parsing or XML conversion errors
			e.printStackTrace();
		}
	}
}
