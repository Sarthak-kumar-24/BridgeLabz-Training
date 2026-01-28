package com.lambdaexp.customsortinginecommerce;

/**
 * Product class representing an item in the e-commerce system. Follows Java
 * Bean conventions.
 */
class Product {

	private String name;
	private double price;
	private double rating;
	private double discount; // percentage

	public Product(String name, double price, double rating, double discount) {
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.discount = discount;
	}


	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getRating() {
		return rating;
	}

	public double getDiscount() {
		return discount;
	}

	@Override
	public String toString() {
		return String.format("%s | Price: Rs%.2f | Rating: %.1f | Discount: %.0f%%", name, price, rating, discount);
	}
}
