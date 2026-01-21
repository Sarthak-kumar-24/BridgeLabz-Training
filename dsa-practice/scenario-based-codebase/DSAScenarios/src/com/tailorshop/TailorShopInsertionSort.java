package com.tailorshop;

import java.util.Scanner;

/*
 * TailorShop – Sorting Orders by Delivery Deadline (Insertion Sort)
 * 
 *  Insertion Sort
 *  
 *  At a tailor’s shop, new clothing orders are received every hour. 
 *  Each order has a deadline, and the owner maintains a sorted list of orders by delivery date. 
 *   Since each new order is inserted into a nearly sorted list, Insertion Sort is simple and fast.
 *  
 */
public class TailorShopInsertionSort {

	// Order class to store order details
	public static class Order {
		String orderName;
		int deadline; // delivery deadline in days

		public Order(String orderName, int deadline) {
			this.orderName = orderName;
			this.deadline = deadline;
		}
	}

	public static void insertionSort(Order[] orders) {

		// Loop starts from second element
		for (int i = 1; i < orders.length; i++) {

			Order currentOrder = orders[i];
			int j = i - 1;

			/*
			 * Shift orders that have a greater deadline one position ahead to make space
			 */
			while (j >= 0 && orders[j].deadline > currentOrder.deadline) {
				orders[j + 1] = orders[j];
				j--;
			}

			// Insert current order at correct position
			orders[j + 1] = currentOrder;
		}

	}

	// Display all orders
	public static void displayOrders(Order[] orders) {
		System.out.println("\n Orders sorted by delivery deadline:");
		for (Order order : orders) {
			System.out.println("Order: " + order.orderName + " | Deadline: " + order.deadline + " days");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Taking number of orders
		System.out.print("Enter number of orders: ");
		int n = sc.nextInt();
		sc.nextLine(); // consume leftover newline

		Order[] orders = new Order[n];

		// Taking order details
		for (int i = 0; i < n; i++) {
			System.out.print("\nEnter order name: ");
			String name = sc.nextLine();

			System.out.print("Enter delivery deadline (in days): ");
			int deadline = sc.nextInt();
			sc.nextLine(); // consume newline

			orders[i] = new Order(name, deadline);
		}

		// Sorting orders by deadline
		insertionSort(orders);

		// Display sorted orders
		displayOrders(orders);

		sc.close();
	}

}
