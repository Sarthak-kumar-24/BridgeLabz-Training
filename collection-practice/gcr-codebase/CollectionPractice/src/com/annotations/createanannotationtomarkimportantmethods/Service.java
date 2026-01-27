package com.annotations.createanannotationtomarkimportantmethods;

import java.lang.reflect.Method;

class Service {

	// Uses default level = "HIGH"
	@ImportantMethod
	public void processPayment() {
		System.out.println("Processing payment...");
	}

	// Explicitly setting importance level
	@ImportantMethod(level = "MEDIUM")
	public void generateReport() {
		System.out.println("Generating report...");
	}

	// Not annotated
	public void helperMethod() {
		System.out.println("Helper method");
	}

	public static void main(String[] args) {

		// Create object of Service class
		Service service = new Service();

		// Get Class object
		Class<?> clazz = service.getClass();

		// Get all declared methods
		Method[] methods = clazz.getDeclaredMethods();

		// Iterate through methods
		for (Method method : methods) {

			// Check if method has ImportantMethod annotation
			if (method.isAnnotationPresent(ImportantMethod.class)) {

				// Get annotation instance
				ImportantMethod im = method.getAnnotation(ImportantMethod.class);

				// Print method details
				System.out.println("Method Name : " + method.getName());
				System.out.println("Importance  : " + im.level());
				System.out.println("-------------------------");
			}
		}

	}

}
