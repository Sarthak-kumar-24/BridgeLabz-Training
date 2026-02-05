package com.functional.function;

import java.util.function.Function;

import com.functional.model.Product;

/*
 * DiscountFunction
 * --------------------
 * Demonstrates use of Function in an e-commerce scenario.
 * Converts product price into discounted price
 * using a discount rule.
 */
public class DiscountFunction {
	public static void main(String[] args) {

		Product p1 = new Product("Laptop", 60000);
		Product p2 = new Product("Mouse", 800);

		// Function: Product -> Discounted Price (10% off)
		Function<Product, Double> discountFn = p -> p.getPrice() * 0.90;

		printDiscount(p1, discountFn);
		printDiscount(p2, discountFn);
	}

	static void printDiscount(Product p, Function<Product, Double> fn) {

		double discounted = fn.apply(p);

		System.out.println(p.getName() + " Original: Rs " + p.getPrice() + " | After Discount: Rs " + discounted);
	}

}
