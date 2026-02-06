package com.functional.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

/*
 * DateTimeSupplier
 * --------------------
 * Uses Supplier to provide current date and time.
 */
public class DateTimeSupplier {
	public static void main(String[] args) {

		Supplier<LocalDateTime> nowSupplier = () -> LocalDateTime.now();

		System.out.println(" Current time (sarthak): " + nowSupplier.get());
		System.out.println(" Current time (nishita): " + nowSupplier.get());
	}

}
