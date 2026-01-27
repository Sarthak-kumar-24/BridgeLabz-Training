package com.reflection.getclassinformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassInfo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Taking class name input
		System.out.print("Enter full class name (e.g. java.util.ArrayList): ");
		String className = sc.nextLine();

		try {
			// Load class at runtime
			Class<?> cls = Class.forName(className);

			System.out.println("\n Class Name: " + cls.getName());

			/* ===== CONSTRUCTORS ===== */
			System.out.println("\n Constructors:");
			Constructor<?>[] constructors = cls.getDeclaredConstructors();

			for (Constructor<?> constructor : constructors) {
				System.out.println(constructor);
			}

			/* ===== FIELDS ===== */
			System.out.println("\n Fields:");
			Field[] fields = cls.getDeclaredFields();

			for (Field field : fields) {
				System.out.println(field);
			}

			/* ===== METHODS ===== */
			System.out.println("\n Methods:");
			Method[] methods = cls.getDeclaredMethods();

			for (Method method : methods) {
				System.out.println(method);
			}

		} catch (ClassNotFoundException e) {
			System.out.println(" Class not found. Please check the class name.");
		}

		sc.close();
	}

}
