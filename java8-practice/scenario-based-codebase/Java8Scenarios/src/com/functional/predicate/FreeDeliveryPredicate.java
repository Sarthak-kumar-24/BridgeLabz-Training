package com.functional.predicate;

import java.util.function.Predicate;

import com.functional.model.Product;

/*
 * FreeDeliveryPredicateDemo
 * -------------------------
 * Demonstrates use of Predicate in an e-commerce scenario.
 * Checks whether an order (product price) is eligible
 * for free delivery based on minimum order value rule.
 */
public class FreeDeliveryPredicate {
	public static void main(String[] args) {

		Product p1 = new Product("Headphones", 799);
		Product p2 = new Product("Pen Drive", 299);

		// Predicate: free delivery if price >= 500
		Predicate<Product> freeDeliveryRule = p -> p.getPrice() >= 500;

		checkDelivery(p1, freeDeliveryRule);
		checkDelivery(p2, freeDeliveryRule);
	}

	static void checkDelivery(Product p, Predicate<Product> rule) {

		if (rule.test(p)) {
			System.out.println(p.getName() + " Free Delivery Eligible");
		} else {
			System.out.println(p.getName() + " Delivery Charges Apply");
		}
	}

}
