package com.annotations.annotationforloggingmethodexecutiontime;

import java.lang.reflect.Method;

class PerformanceTest {

	@LogExecutionTime
	public void fastMethod() {
		// Simulating fast operation
		for (int i = 0; i < 1_000; i++) {
			Math.sqrt(i);
		}
	}

	@LogExecutionTime
	public void slowMethod() {
		// Simulating slow operation
		for (int i = 0; i < 10_000_000; i++) {
			Math.sqrt(i);
		}
	}

	// Not annotated → execution time will NOT be logged
	public void normalMethod() {
		System.out.println("Normal method executed");
	}

	public static void main(String[] args) {

		// Create object
		PerformanceTest test = new PerformanceTest();

		// Get Class object
		Class<?> clazz = test.getClass();

		// Get all declared methods
		Method[] methods = clazz.getDeclaredMethods();

		// Loop through methods
		for (Method method : methods) {

			// Check if method is annotated with @LogExecutionTime
			if (method.isAnnotationPresent(LogExecutionTime.class)) {

				try {
					// Record start time
					long startTime = System.nanoTime();

					// Invoke method
					method.invoke(test);

					// Record end time
					long endTime = System.nanoTime();

					// Calculate execution time
					long executionTime = endTime - startTime;

					// Print result
					System.out.println("Method: " + method.getName() + " | Execution Time: " + executionTime + " ns");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
	}

}
