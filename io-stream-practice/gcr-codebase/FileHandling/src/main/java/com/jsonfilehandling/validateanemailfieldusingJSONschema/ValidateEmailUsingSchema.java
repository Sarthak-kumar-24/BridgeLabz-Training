package com.jsonfilehandling.validateanemailfieldusingJSONschema;

//Import File class for reading files
import java.io.File;

//Import Jackson ObjectMapper for JSON parsing
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

//Import JSON Schema validator classes
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

import java.util.Set;

/**
* This class validates a JSON file against a JSON Schema
* to ensure the email field is present and correctly formatted.
*/
public class ValidateEmailUsingSchema {

 /**
  * Main method – execution starts here
  */
 public static void main(String[] args) {

     try {
         // Create ObjectMapper instance
         ObjectMapper mapper = new ObjectMapper();

         // Read JSON data file into JsonNode
         JsonNode jsonData = mapper.readTree(new File("data.json"));

         // Read JSON Schema file into JsonNode
         JsonNode schemaNode = mapper.readTree(new File("email-schema.json"));

         // Create JsonSchemaFactory with specified schema version
         JsonSchemaFactory factory =
                 JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);

         // Create JsonSchema object from schemaNode
         JsonSchema schema = factory.getSchema(schemaNode);

         // Validate JSON data against schema
         Set<ValidationMessage> errors = schema.validate(jsonData);

         // Check if validation errors exist
         if (errors.isEmpty()) {
             System.out.println(" Email is valid according to JSON Schema");
         } else {
             System.out.println(" Email validation failed");

             // Print all validation error messages
             for (ValidationMessage error : errors) {
                 System.out.println(error.getMessage());
             }
         }

     } catch (Exception e) {
         // Handle file reading or validation errors
         e.printStackTrace();
     }
 }
}
