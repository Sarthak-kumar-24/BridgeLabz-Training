package com.jsonfilehandling.validateanemailfieldusingJSONschema;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

import java.io.File;
import java.io.InputStream;
import java.util.Set;

/**
 * This class validates a JSON file against a JSON Schema to ensure the email
 * field is present and correctly formatted.
 */
public class ValidateEmailUsingSchema {

	public static void main(String[] args) {

		try {
			ObjectMapper mapper = new ObjectMapper();

			// Load JSON data from resources
			InputStream jsonStream = ValidateEmailUsingSchema.class.getClassLoader()
					.getResourceAsStream("JSONFiles/users.json");

			// Load JSON Schema from resources
			InputStream schemaStream = ValidateEmailUsingSchema.class.getClassLoader()
					.getResourceAsStream("JSONFiles/email-schema.json");

			if (jsonStream == null || schemaStream == null) {
				throw new RuntimeException("JSON or Schema file not found in resources");
			}
			// Parse JSON and Schema
			JsonNode jsonData = mapper.readTree(jsonStream);
			JsonNode jsonSchema = mapper.readTree(schemaStream);

			// Create schema validator
			JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);

			JsonSchema schema = factory.getSchema(jsonSchema);

			// Validate
			Set<ValidationMessage> errors = schema.validate(jsonData);

			if (errors.isEmpty()) {
				System.out.println(" Email is valid as per JSON Schema");
			} else {
				System.out.println(" Validation errors:");
				errors.forEach(err -> System.out.println(err.getMessage()));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
