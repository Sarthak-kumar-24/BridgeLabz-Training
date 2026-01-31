package com.collectors.orderrevenuesummary;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		// Sample order list
		List<Order> orders = Arrays.asList(new Order("Aman", 1200.50), new Order("Riya", 800.00),
				new Order("Aman", 450.00), new Order("Riya", 200.00), new Order("Kunal", 1500.00));

		// Core Logic:
		// Group orders by customer -> sum all amounts per customer
		Map<String, Double> revenuePerCustomer = orders.stream()

				// groupingBy -> groups by customer name
				.collect(Collectors.groupingBy(

						// key mapper -> customer name
						Order::getCustomer,

						// downstream collector -> sum double values
						Collectors.summingDouble(Order::getAmount)));

		// Print result
		System.out.println(revenuePerCustomer);
	}

}
