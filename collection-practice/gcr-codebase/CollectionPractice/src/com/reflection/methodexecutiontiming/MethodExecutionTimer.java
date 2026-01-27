package com.reflection.methodexecutiontiming;

import java.lang.reflect.Method;

/*
 * MethodExecutionTimer
 * --------------------
 * Measures execution time of methods using Reflection.
 */
public class MethodExecutionTimer {

	public static void main(String[] args) {

		try {
			// Create object dynamically
			TaskService service = new TaskService();

			// Get class metadata
			Class<?> cls = service.getClass();

			// Iterate through declared methods
			for (Method method : cls.getDeclaredMethods()) {

				// Only measure methods with no parameters
				if (method.getParameterCount() == 0) {

					long startTime = System.nanoTime();

					// Invoke method dynamically
					method.invoke(service);

					long endTime = System.nanoTime();

					long durationNs = endTime - startTime;
					double durationMs = durationNs / 1_000_000.0;

					System.out.println("Method: " + method.getName() + " | Execution Time: " + durationMs + " ms");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
