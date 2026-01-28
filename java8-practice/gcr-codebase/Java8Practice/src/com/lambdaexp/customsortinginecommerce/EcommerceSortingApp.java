package com.lambdaexp.customsortinginecommerce;

import java.util.*;

/**
 * Demonstrates dynamic product sorting using Comparator and Lambda expressions.
 */
public class EcommerceSortingApp {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();

		
		products.add(new Product("Laptop", 65000, 4.6, 15));
		products.add(new Product("Headphones", 2500, 4.2, 40));
		products.add(new Product("Smartphone", 45000, 4.8, 10));
		products.add(new Product("Smartwatch", 12000, 4.1, 30));

		//  Campaign 1: Sort by Price (Low -> High)
		System.out.println(" Budget Sale (Sort by Price):");
		products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
		products.forEach(System.out::println);

		//  Campaign 2: Sort by Rating (High -> Low)
		System.out.println("\n Top Rated Sale (Sort by Rating):");
		products.sort((p1, p2) -> Double.compare(p2.getRating(), p1.getRating()));
		products.forEach(System.out::println);

		// Campaign 3: Sort by Discount (High -> Low)
		System.out.println("\n Mega Discount Sale (Sort by Discount):");
		products.sort((p1, p2) -> Double.compare(p2.getDiscount(), p1.getDiscount()));
		products.forEach(System.out::println);
	}
}
