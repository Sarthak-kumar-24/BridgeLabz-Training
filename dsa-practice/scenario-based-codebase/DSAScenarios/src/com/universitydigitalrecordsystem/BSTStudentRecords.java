package com.universitydigitalrecordsystem;

import java.util.Scanner;

/*
 * BSTStudentRecords
 * -----------------
 * Binary Search Tree implementation for managing
 * student records using roll numbers.
 */
public class BSTStudentRecords {

	static Node root = null;

	/* ================= INSERT ================= */
	static Node insert(Node root, int roll, String name) {

		// If tree is empty
		if (root == null) {
			return new Node(roll, name);
		}

		// Go left
		if (roll < root.roll) {
			root.left = insert(root.left, roll, name);
		}
		// Go right
		else if (roll > root.roll) {
			root.right = insert(root.right, roll, name);
		}

		return root;
	}

	/* ================= SEARCH ================= */
	static void search(Node root, int roll) {

		if (root == null) {
			System.out.println(" Student not found");
			return;
		}

		if (roll == root.roll) {
			System.out.println(" Found: " + root.roll + " - " + root.name);
		} else if (roll < root.roll) {
			search(root.left, roll);
		} else {
			search(root.right, roll);
		}
	}

	/* ================= FIND MIN ================= */
	static Node findMin(Node root) {
		while (root.left != null)
			root = root.left;
		return root;
	}

	/* ================= DELETE ================= */
	static Node delete(Node root, int roll) {

		if (root == null)
			return null;

		if (roll < root.roll) {
			root.left = delete(root.left, roll);
		} else if (roll > root.roll) {
			root.right = delete(root.right, roll);
		} else {
			// Case 1: No child
			if (root.left == null && root.right == null)
				return null;

			// Case 2: One child
			if (root.left == null)
				return root.right;

			if (root.right == null)
				return root.left;

			// Case 3: Two children
			Node successor = findMin(root.right);
			root.roll = successor.roll;
			root.name = successor.name;
			root.right = delete(root.right, successor.roll);
		}

		return root;
	}

	/* ================= INORDER TRAVERSAL ================= */
	static void inorder(Node root) {

		if (root != null) {
			inorder(root.left);
			System.out.println(root.roll + " - " + root.name);
			inorder(root.right);
		}
	}

	/* ================= MAIN ================= */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\n University Record System");
			System.out.println("1. Insert Student");
			System.out.println("2. Delete Student");
			System.out.println("3. Search Student");
			System.out.println("4. Display Sorted Roll Numbers");
			System.out.println("5. Exit");
			System.out.print("Choose option: ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter roll number: ");
				int roll = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter student name: ");
				String name = sc.nextLine();
				root = insert(root, roll, name);
				System.out.println(" Student inserted");
				break;

			case 2:
				System.out.print("Enter roll number to delete: ");
				roll = sc.nextInt();
				root = delete(root, roll);
				System.out.println(" Student deleted (if existed)");
				break;

			case 3:
				System.out.print("Enter roll number to search: ");
				roll = sc.nextInt();
				search(root, roll);
				break;

			case 4:
				System.out.println("\n Sorted Student Roll List:");
				inorder(root);
				break;

			case 5:
				System.out.println(" Exiting system");
				sc.close();
				return;

			default:
				System.out.println(" Invalid option");
			}
		}
	}
}
