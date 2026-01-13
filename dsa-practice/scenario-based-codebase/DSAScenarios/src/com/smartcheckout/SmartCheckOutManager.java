package com.smartcheckout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/*
 * SmartCheckout – Supermarket Billing Queue (Queue + HashMap)
 * 
 * At a supermarket, each checkout counter maintains a Queue of customers.
 * Each customer has a list of items, and a HashMap is used to fetch price and stock quickly.
 * 
 * 
 * Add/remove customers from the queue.
 * Fetch item prices from map.
 * Update stock on purchase.
 * Methods  used 
 * setupStore() 
 * addCustomer()
 * removeCustomer()
 * processCustomer()
 * showStock()
 */
public class SmartCheckOutManager {

	/* [man1]-  -  -  -  - 
	 * [man2]-  -  -  -  - 
	 * [man3]-  -  -  -  - 
	 * [man4]-  -  -  -  - 
	 * [man5]-  -  -  -  - 
	 * [man6]-  -  -  -  - 
	 * 
	 */
	private static Queue<Customer> checkoutQueue = new LinkedList<>();

	/*
	 * [item1 ] -> [price] [item2 ] -> [price] [item3 ] -> [price]
	 */
	private static HashMap<String, Integer> priceMap = new HashMap<>();

	/*
	 * [item1 ] -> [stock] [item2 ] -> [stock] [item3 ] -> [stock]
	 */
	private static HashMap<String, Integer> stockMap = new HashMap<>();

	private static void setupStore() {
		priceMap.put("Milk", 50);
		priceMap.put("Bread", 40);
		priceMap.put("Rice", 60);
		priceMap.put("Eggs", 10);
		priceMap.put("BarleyRice", 60);
		priceMap.put("Sweets", 30);

		stockMap.put("Milk", 100);
		stockMap.put("Bread", 70);
		stockMap.put("Rice", 20);
		stockMap.put("Eggs", 30);
		stockMap.put("BarleyRice", 16);
		stockMap.put("Sweets", 30);
	}
	private static void removeCustomer() {
		if(!checkoutQueue.isEmpty() ) {
			checkoutQueue.remove();
			System.out.print("Customer Removed ");
			
		}
		System.out.println("No Customers to Remove");
		
		
	}

	private static void addCustomer(Scanner sc) {
		System.out.print("Enter customer name: ");
		String name = sc.nextLine();

		System.out.print("Enter number of items: ");
		int n = sc.nextInt();
		sc.nextLine();

		List<String> items = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter item name: ");
			items.add(sc.nextLine());
		}

		checkoutQueue.offer(new Customer(name, items));
		System.out.println(" Customer added to checkout queue");
	}
	

	private static void processCustomer() {
		if (checkoutQueue.isEmpty()) {
			System.out.println(" No customers in queue");
			return;
		}

		Customer customer = checkoutQueue.poll();
		int total = 0;

		System.out.println("\n Billing Customer: " + customer.name);

		for (String item : customer.items) {

			if (!priceMap.containsKey(item)) {
				System.out.println(item + "  Item not found");
				continue;
			}

			if (stockMap.get(item) <= 0) {
				System.out.println(item + "  Out of stock");
				continue;
			}

			int price = priceMap.get(item);
			total += price;

			
			stockMap.put(item, stockMap.get(item) - 1);
			System.out.println(item + " Rs" + price);
		}

		System.out.println(" Total Bill: Rs" + total);
	}
	
    private static void showStock() {
        System.out.println("\n---------- Current Stock:------------");
        for (String item : stockMap.keySet()) {
            System.out.println(item + " → " + stockMap.get(item));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        setupStore();

        while (true) {
            System.out.println("\n==========  SMART CHECKOUT MENU =========");
            System.out.println("1. Add Customer to Queue");
            System.out.println("2. Remove Customer to Queue");
            System.out.println("3. Process Next Customer");
            System.out.println("4. Show Stock");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addCustomer(sc);
                    break;
                case 2:
                    removeCustomer();
                    break;

                case 3:
                    processCustomer();
                    break;

                case 4:
                    showStock();
                    break;

                case 5:
                    System.out.println(" Checkout closed");
                    sc.close();
                    return;

                default:
                    System.out.println(" Invalid choice");
            }
        }
    }

}
