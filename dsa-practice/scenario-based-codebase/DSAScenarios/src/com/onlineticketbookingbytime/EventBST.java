package com.onlineticketbookingbytime;

import java.util.Scanner;

/*
 * EventBST
 * --------
 * Manages online ticket booking events sorted by start time.
 */
public class EventBST {

	static Node root = null;

	/* ================= INSERT EVENT ================= */
	static Node insert(Node node, int time, String name) {

		if (node == null)
			return new Node(time, name);

		if (time < node.startTime)
			node.left = insert(node.left, time, name);
		else if (time > node.startTime)
			node.right = insert(node.right, time, name);

		return node;
	}

	/* ================= FIND MIN ================= */
	static Node findMin(Node node) {
		while (node.left != null)
			node = node.left;
		return node;
	}

	/* ================= CANCEL EVENT ================= */
	static Node delete(Node node, int time) {

		if (node == null)
			return null;

		if (time < node.startTime)
			node.left = delete(node.left, time);
		else if (time > node.startTime)
			node.right = delete(node.right, time);
		else {

			// Case 1 & 2: One or no child
			if (node.left == null)
				return node.right;
			else if (node.right == null)
				return node.left;

			// Case 3: Two children
			Node successor = findMin(node.right);
			node.startTime = successor.startTime;
			node.eventName = successor.eventName;
			node.right = delete(node.right, successor.startTime);
		}

		return node;
	}

	/* ================= DISPLAY EVENTS IN ORDER ================= */
	static void display(Node node) {

		if (node == null)
			return;

		display(node.left);
		System.out.println(" Time: " + node.startTime + " | Event: " + node.eventName);
		display(node.right);
	}

	/* ================= MAIN ================= */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\n Online Ticket Booking");
			System.out.println("1. Insert Event");
			System.out.println("2. Cancel Event");
			System.out.println("3. Show Events in Order");
			System.out.println("4. Exit");
			System.out.print("Choose option: ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				sc.nextLine();
				System.out.print("Enter event name: ");
				String name = sc.nextLine();
				System.out.print("Enter start time (HHMM): ");
				int time = sc.nextInt();
				root = insert(root, time, name);
				System.out.println(" Event added");
				break;

			case 2:
				System.out.print("Enter start time to cancel: ");
				time = sc.nextInt();
				root = delete(root, time);
				System.out.println(" Event cancelled");
				break;

			case 3:
				System.out.println("\n Upcoming Events:");
				display(root);
				break;

			case 4:
				sc.close();
				return;

			default:
				System.out.println(" Invalid choice");
			}
		}
	}
}
