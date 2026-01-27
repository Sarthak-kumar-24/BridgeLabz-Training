package com.healthcheckpro;

import java.lang.reflect.Method;

/**
 * HealthCheckPro scans controller classes using Reflection and validates API
 * annotations.
 */
public class HealthCheckPro {

	
	public static void main(String[] args) {

		// Controller class to be scanned
		Class<?> controllerClass = LabTestController.class;

		System.out.println(" Scanning API Metadata for: " + controllerClass.getSimpleName());
		System.out.println("----------------------------------");

		// Loop through all declared methods of the controller
		for (Method method : controllerClass.getDeclaredMethods()) {

			// Get method name
			String methodName = method.getName();

			// Check for @PublicAPI annotation
			boolean isPublicAPI = method.isAnnotationPresent(PublicAPI.class);

			// Check for @RequiresAuth annotation
			boolean requiresAuth = method.isAnnotationPresent(RequiresAuth.class);

			// Print API documentation entry
			System.out.println("API Method: " + methodName);

			if (!isPublicAPI) {
				System.out.println(" ERROR: Missing @PublicAPI annotation");
			} else {
				System.out.println(" Public API");
			}

			if (requiresAuth) {
				System.out.println(" Authentication Required");
			} else {
				System.out.println(" No Authentication Required");
			}

			System.out.println();
		}
	}
}
