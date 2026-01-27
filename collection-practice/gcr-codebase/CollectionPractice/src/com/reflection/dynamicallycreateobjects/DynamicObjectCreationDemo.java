package com.reflection.dynamicallycreateobjects;

import java.lang.reflect.Constructor;

/*
 * DynamicObjectCreationDemo
 * -------------------------
 * Demonstrates object creation using Reflection.
 */
public class DynamicObjectCreationDemo {

	public static void main(String[] args) {

		try {
			// Load Student class dynamically
			Class<?> cls = Class.forName("Student");

			/* ===== USING DEFAULT CONSTRUCTOR ===== */
			Constructor<?> defaultConstructor = cls.getDeclaredConstructor();
			Object student1 = defaultConstructor.newInstance();

			System.out.println("Created using default constructor:");
			cls.getMethod("display").invoke(student1);

			/* ===== USING PARAMETERIZED CONSTRUCTOR ===== */
			Constructor<?> paramConstructor = cls.getDeclaredConstructor(int.class, String.class);

			Object student2 = paramConstructor.newInstance(101, "Sarthak");

			System.out.println("\nCreated using parameterized constructor:");
			cls.getMethod("display").invoke(student2);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
