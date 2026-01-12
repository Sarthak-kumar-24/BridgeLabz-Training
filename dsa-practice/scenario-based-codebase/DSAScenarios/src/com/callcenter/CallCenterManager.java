package com.callcenter;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/*
 *  CallCenter – Customer Queue Manager (Queue + HashMap)
 * 
 *  In a telecom call center, customers are queued based on the time of call. Priority
 * customers have a special queue. 
 *A HashMap keeps track of the number of times each user has
 * called this month.
 * 
 * Queue for managing incoming calls.
 * HashMap for customer data.
 * Priority Queue for VIP customers.
 */
public class CallCenterManager {

	private Queue<Customer> normalQueue = new LinkedList<>();

	private PriorityQueue<Customer> vipQueue = new PriorityQueue<>(Comparator.comparingLong(c -> c.callTime));

	private HashMap<Integer, Integer> callCountMap = new HashMap<>();

	// Adds call
	private void receiveCall(Customer customer) {

		callCountMap.put(customer.id, callCountMap.getOrDefault(customer.id, 0) + 1);

		if (customer.isVIP) {
			vipQueue.offer(customer);
			System.out.println(" VIP call added successfully");
		} else {
			normalQueue.offer(customer);
			System.out.println(" Normal call added successfully");
		}
	}

	private void handleNextCall() {

		if (!vipQueue.isEmpty()) {
			Customer c = vipQueue.poll();
			System.out.println(" Handling VIP customer: " + c.name);
		} else if (!normalQueue.isEmpty()) {
			Customer c = normalQueue.poll();
			System.out.println(" Handling normal customer: " + c.name);
		} else {
			System.out.println(" No calls to handle");
		}
	}


	private void showCallStats() {
		System.out.println("\n Monthly Call Count");
		if (callCountMap.isEmpty()) {
			System.out.println("No data available");
			return;
		}

		for (Map.Entry<Integer, Integer> entry : callCountMap.entrySet()) {
			System.out.println("Customer ID: " + entry.getKey() + " | Total Calls: " + entry.getValue());
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CallCenterManager manager = new CallCenterManager();

		while (true) {
			System.out.println("\n========= CALL CENTER MENU =========");
			System.out.println("1. Add Incoming Call");
			System.out.println("2. Handle Next Call");
			System.out.println("3. Show Monthly Call Stats");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();
			sc.nextLine(); 

			switch (choice) {

			case 1:
				System.out.print("Enter Customer ID: ");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter Customer Name: ");
				String name = sc.nextLine();

				System.out.print("Is VIP? (true/false): ");
				boolean isVIP = sc.nextBoolean();

				manager.receiveCall(new Customer(id, name, isVIP));
				break;

			case 2:
				manager.handleNextCall();
				break;

			case 3:
				manager.showCallStats();
				break;

			case 4:
				System.out.println(" Exiting Call Center System");
				sc.close();
				return;

			default:
				System.out.println(" Invalid choice, try again");
			}
		}
	}

}
