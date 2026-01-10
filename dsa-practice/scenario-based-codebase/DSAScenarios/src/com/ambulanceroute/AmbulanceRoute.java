package com.ambulanceroute;

import java.util.Scanner;
/*
 * AmbulanceRoute – Emergency Patient Navigation (Circular Linked List)
 * 
 * 
 *  In a hospital, there are multiple buildings connected in a circular fashion:
 * Emergency → Radiology → Surgery → ICU → Emergency. When an ambulance is bringing in patients, 
 * it follows a Circular Linked List to decide the nearest available unit for emergency treatment.
 */

public class AmbulanceRoute {

	private UnitNode head = null;
	private UnitNode current = null;

	// Adds unit to circular list
	public void addUnit(String name, boolean available) {
		UnitNode newNode = new UnitNode(name, available);

		if (head == null) {
			head = newNode;
			newNode.next = head;
			current = head;
			return;
		}

		UnitNode temp = head;
		while (temp.next != head) {
			temp = temp.next;
		}

		temp.next = newNode;
		newNode.next = head;
	}

	// Finds nearest available unit
	public void findAvailableUnit() {
		if (head == null) {
			System.out.println(" No hospital units available");
			return;
		}

		UnitNode temp = current;

		do {
			if (temp.available) {
				current = temp;
				System.out.println(" Patient redirected to: " + temp.name);
				return;
			}
			temp = temp.next;
		} while (temp != current);

		System.out.println(" No available unit found");
	}

	// Marks unit under maintenance (remove)
	public void removeUnit(String name) {
		if (head == null) {
			System.out.println(" No units to remove");
			return;
		}

		UnitNode curr = head;
		UnitNode prev = null;

		do {
			if (curr.name.equalsIgnoreCase(name)) {

				if (curr == head && curr.next == head) {
					head = null;
					current = null;
				} else {
					if (curr == head) {
						head = head.next;
					}

					prev.next = curr.next;

					if (current == curr) {
						current = curr.next;
					}
				}

				System.out.println(" Unit removed (maintenance): " + name);
				return;
			}

			prev = curr;
			curr = curr.next;

		} while (curr != head);

		System.out.println(" Unit not found");
	}

	// Displays all units
	void displayUnits() {
		if (head == null) {
			System.out.println(" No hospital units");
			return;
		}

		System.out.println("\n HOSPITAL UNITS (Circular Route)");
		System.out.println("--------------------------------");

		UnitNode temp = head;
		int i = 1;

		do {
			System.out.println(i + ". " + temp.name + " | Status: " + (temp.available ? "Available" : "Busy"));
			temp = temp.next;
			i++;
		} while (temp != head);

		System.out.println("--------------------------------");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		AmbulanceRoute route = new AmbulanceRoute();
		int choice;

		// Initial setup
		route.addUnit("Emergency", true);
		route.addUnit("Radiology", false);
		route.addUnit("Surgery", false);
		route.addUnit("ICU", true);

		do {
			System.out.println("\n==============================");
			System.out.println(" AMBULANCE ROUTE SYSTEM");
			System.out.println("==============================");
			System.out.println("1. Find Nearest Available Unit");
			System.out.println("2. Display Hospital Units");
			System.out.println("3. Remove Unit (Maintenance)");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:
				route.findAvailableUnit();
				break;

			case 2:
				route.displayUnits();
				break;

			case 3:
				System.out.print("Enter unit name to remove: ");
				String name = sc.nextLine();
				route.removeUnit(name);
				break;

			case 4:
				System.out.println(" Ambulance system shutting down");
				break;

			default:
				System.out.println(" Invalid choice");
			}

		} while (choice != 4);

		sc.close();
	}

}
