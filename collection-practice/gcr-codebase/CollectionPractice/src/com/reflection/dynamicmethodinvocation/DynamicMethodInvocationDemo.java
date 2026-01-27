package com.reflection.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

/*
 * DynamicMethodInvocationDemo
 * ---------------------------
 * Invokes methods dynamically using Reflection
 * based on user input.
 */
public class DynamicMethodInvocationDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			// Create object normally
			MathOperations math = new MathOperations();

			// Get class object
			Class<?> cls = math.getClass();

			// Take user input
			System.out.print("Enter method name (add / subtract / multiply): ");
			String methodName = sc.nextLine();

			System.out.print("Enter first number: ");
			int a = sc.nextInt();

			System.out.print("Enter second number: ");
			int b = sc.nextInt();

			// Get method dynamically
			Method method = cls.getMethod(methodName, int.class, int.class);

			// Invoke method dynamically
			Object result = method.invoke(math, a, b);

			// Display result
			System.out.println("Result: " + result);

		} catch (NoSuchMethodException e) {
			System.out.println(" Invalid method name!");
		} catch (Exception e) {
			e.printStackTrace();
		}

		sc.close();
	}
}
