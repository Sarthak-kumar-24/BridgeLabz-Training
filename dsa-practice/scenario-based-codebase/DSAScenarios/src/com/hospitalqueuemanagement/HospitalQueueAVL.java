package com.hospitalqueuemanagement;

import java.util.Scanner;

/*
 * HospitalQueueAVL
 * ----------------
 * AVL Tree for hospital patient queue management.
 */
public class HospitalQueueAVL {

	static Node root = null;

	/* ========== HEIGHT ========== */
	static int height(Node n) {
		return n == null ? 0 : n.height;
	}

	/* ========== BALANCE FACTOR ========== */
	static int getBalance(Node n) {
		return n == null ? 0 : height(n.left) - height(n.right);
	}

	/* ========== RIGHT ROTATION ========== */
	static Node rightRotate(Node y) {
		Node x = y.left;
		Node t2 = x.right;

		x.right = y;
		y.left = t2;

		y.height = Math.max(height(y.left), height(y.right)) + 1;
		x.height = Math.max(height(x.left), height(x.right)) + 1;

		return x;
	}

	/* ========== LEFT ROTATION ========== */
	static Node leftRotate(Node x) {
		Node y = x.right;
		Node t2 = y.left;

		y.left = x;
		x.right = t2;

		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;

		return y;
	}

	/* ========== INSERT PATIENT ========== */
	static Node insert(Node node, int time, String name) {

		if (node == null)
			return new Node(time, name);

		if (time < node.time)
			node.left = insert(node.left, time, name);
		else if (time > node.time)
			node.right = insert(node.right, time, name);
		else
			return node; // duplicate time ignored

		node.height = 1 + Math.max(height(node.left), height(node.right));
		int balance = getBalance(node);

		// LL
		if (balance > 1 && time < node.left.time)
			return rightRotate(node);

		// RR
		if (balance < -1 && time > node.right.time)
			return leftRotate(node);

		// LR
		if (balance > 1 && time > node.left.time) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}

		// RL
		if (balance < -1 && time < node.right.time) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		return node;
	}

	/* ========== FIND MIN ========== */
	static Node minValue(Node node) {
		while (node.left != null)
			node = node.left;
		return node;
	}

	/* ========== DELETE PATIENT ========== */
	static Node delete(Node node, int time) {

		if (node == null)
			return node;

		if (time < node.time)
			node.left = delete(node.left, time);
		else if (time > node.time)
			node.right = delete(node.right, time);
		else {
			if (node.left == null || node.right == null) {
				node = (node.left != null) ? node.left : node.right;
			} else {
				Node temp = minValue(node.right);
				node.time = temp.time;
				node.name = temp.name;
				node.right = delete(node.right, temp.time);
			}
		}

		if (node == null)
			return node;

		node.height = Math.max(height(node.left), height(node.right)) + 1;
		int balance = getBalance(node);

		// LL
		if (balance > 1 && getBalance(node.left) >= 0)
			return rightRotate(node);

		// LR
		if (balance > 1 && getBalance(node.left) < 0) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}

		// RR
		if (balance < -1 && getBalance(node.right) <= 0)
			return leftRotate(node);

		// RL
		if (balance < -1 && getBalance(node.right) > 0) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		return node;
	}

	/* ========== DISPLAY BY ARRIVAL TIME ========== */
	static void display(Node node) {
		if (node == null)
			return;

		display(node.left);
		System.out.println(node.time + " | Patient: " + node.name);
		display(node.right);
	}

	/* ========== MAIN ========== */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\n Hospital Queue Management");
			System.out.println("1. Register Patient");
			System.out.println("2. Discharge Patient");
			System.out.println("3. Display by Arrival Time");
			System.out.println("4. Exit");
			System.out.print("Choose option: ");

			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				sc.nextLine();
				System.out.print("Enter patient name: ");
				String name = sc.nextLine();
				System.out.print("Enter check-in time (HHMM): ");
				int time = sc.nextInt();
				root = insert(root, time, name);
				System.out.println(" Patient registered");
				break;

			case 2:
				System.out.print("Enter check-in time to discharge: ");
				time = sc.nextInt();
				root = delete(root, time);
				System.out.println(" Patient discharged");
				break;

			case 3:
				System.out.println("\n Patients by Arrival Time:");
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
