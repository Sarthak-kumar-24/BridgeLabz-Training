package com.reflection.invokeprivatemethod;

import java.lang.reflect.Method;

/*
 * InvokePrivateMethodDemo
 * ----------------------
 * Demonstrates invoking a private method using Reflection.
 */
public class InvokePrivateMethodDemo {

	public static void main(String[] args) {

		try {
			// Create object of Calculator
			Calculator calculator = new Calculator();

			// Get Class object
			Class<?> cls = calculator.getClass();

			// Access private method: multiply(int, int)
			Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

			// Disable access checks
			method.setAccessible(true);

			// Invoke private method
			Object result = method.invoke(calculator, 5, 4);

			// Display result
			System.out.println("Result of private multiply method: " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
