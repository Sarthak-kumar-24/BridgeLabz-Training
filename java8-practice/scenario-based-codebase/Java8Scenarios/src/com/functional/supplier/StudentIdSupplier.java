package com.functional.supplier;

import java.util.UUID;
import java.util.function.Supplier;

/*
 * StudentIdSupplier
 * ---------------------
 * Uses Supplier to generate random student IDs.
 */
public class StudentIdSupplier {

	public static void main(String[] args) {

		Supplier<String> studentIdSupplier = () -> "STU-" + UUID.randomUUID().toString().substring(0, 8);

		System.out.println(" ID for Devijii: " + studentIdSupplier.get());
		System.out.println(" ID for shubham: " + studentIdSupplier.get());
	}

}
