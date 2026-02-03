package com.functional.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.functional.model.Product;

/*
 * ProductComparator
 * ---------------------
 * Compares products by price.
 */
public class ProductComparator {

	public static void main(String[] args) {

		List<Product> list = Arrays.asList(new Product("Laptop", 65000), new Product("Mouse", 900),
				new Product("Keyboard", 2400));

		list.sort(Comparator.comparingDouble(Product::getPrice));

		list.forEach(System.out::println);
	}

}
