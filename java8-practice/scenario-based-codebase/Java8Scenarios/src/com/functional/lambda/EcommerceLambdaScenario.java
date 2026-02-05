package com.functional.lambda;

import java.util.*;
import java.util.function.Predicate;

import com.functional.model.Product;

/*
 * EcommerceLambdaScenario
 * ----------------------
 * Demonstrates real-time lambda
 * expressions in an E-Commerce system.
 */
public class EcommerceLambdaScenario {

	public static void main(String[] args) {

		// Product list
		List<Product> products = Arrays.asList(new Product("Laptop", 55000), new Product("Headphones", 2500),
				new Product("Mobile", 32000), new Product("Keyboard", 800), new Product("Mouse", 600));

		System.out.println("====================================");
		System.out.println(" Shopping / E-Commerce Lambda System ");
		System.out.println("====================================");

		/*--------------------------------------------------
		 1. Lambda to apply 10% discount on product price
		--------------------------------------------------*/
		System.out.println("\n1️ Applying 10% Discount:");
		products.forEach(p -> {
			double discountedPrice = p.getPrice() * 0.90;
			System.out.println(p.getName() + " | Discounted Price: Rs" + discountedPrice);
		});

		/*--------------------------------------------------
		 2. Sort products by price using lambda
		--------------------------------------------------*/
		System.out.println("\n2️ Products Sorted by Price:");
		products.stream().sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice())).forEach(System.out::println);

		/*--------------------------------------------------
		 3. Lambda to check free delivery eligibility
		    (amount > 500)
		--------------------------------------------------*/
		System.out.println("\n3️ Free Delivery Eligibility:");
		Predicate<Product> freeDelivery = p -> p.getPrice() > 500;

		products.forEach(p -> System.out
				.println(p.getName() + " : " + (freeDelivery.test(p) ? "Free Delivery " : "Delivery Charges Apply ")));

		/*--------------------------------------------------
		 4. Lambda to calculate final bill amount
		--------------------------------------------------*/
		System.out.println("\n4️ Final Bill Amount:");
		double totalAmount = products.stream().mapToDouble(Product::getPrice).sum();

		System.out.println("Total Bill Amount: Rs" + totalAmount);

		/*--------------------------------------------------
		 5. Lambda to print product names
		--------------------------------------------------*/
		System.out.println("\n5️ Product Names:");
		products.forEach(p -> System.out.println(" " + p.getName()));

		System.out.println("\n====================================");
		System.out.println(" Program Completed Successfully ");
		System.out.println("====================================");
	}
}
