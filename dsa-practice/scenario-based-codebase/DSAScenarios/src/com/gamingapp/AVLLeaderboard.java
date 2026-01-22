package com.gamingapp;

import java.util.Scanner;

/*
 * AVLLeaderboard
 * --------------
 * AVL Tree implementation for a real-time gaming leaderboard.
 */
public class AVLLeaderboard {

	static Node root = null;

	/* ================= HEIGHT ================= */
	static int height(Node n) {
		return n == null ? 0 : n.height;
	}

	/* ================= BALANCE FACTOR ================= */
	static int getBalance(Node n) {
		return n == null ? 0 : height(n.left) - height(n.right);
	}

	/* ================= RIGHT ROTATION ================= */
	static Node rightRotate(Node y) {
		Node x = y.left;
		Node T2 = x.right;

		x.right = y;
		y.left = T2;

		y.height = Math.max(height(y.left), height(y.right)) + 1;
		x.height = Math.max(height(x.left), height(x.right)) + 1;

		return x;
	}

	/* ================= LEFT ROTATION ================= */
	static Node leftRotate(Node x) {
		Node y = x.right;
		Node T2 = y.left;

		y.left = x;
		x.right = T2;

		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;

		return y;
	}

	/* ================= INSERT / UPDATE ================= */
	static Node insert(Node node, int score, String player) {

		if (node == null)
			return new Node(score, player);

		if (score < node.score)
			node.left = insert(node.left, score, player);
		else if (score > node.score)
			node.right = insert(node.right, score, player);
		else
			return node; // duplicate score ignored

		node.height = 1 + Math.max(height(node.left), height(node.right));

		int balance = getBalance(node);

		// LL
		if (balance > 1 && score < node.left.score)
			return rightRotate(node);

		// RR
		if (balance < -1 && score > node.right.score)
			return leftRotate(node);

		// LR
		if (balance > 1 && score > node.left.score) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}

		// RL
		if (balance < -1 && score < node.right.score) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		return node;
	}

	/* ================= FIND MIN ================= */
	static Node minValueNode(Node node) {
		Node current = node;
		while (current.left != null)
			current = current.left;
		return current;
	}

	/* ================= DELETE PLAYER ================= */
	static Node delete(Node root, int score) {

		if (root == null)
			return root;

		if (score < root.score)
			root.left = delete(root.left, score);
		else if (score > root.score)
			root.right = delete(root.right, score);
		else {
			if ((root.left == null) || (root.right == null)) {
				Node temp = (root.left != null) ? root.left : root.right;
				root = temp;
			} else {
				Node temp = minValueNode(root.right);
				root.score = temp.score;
				root.player = temp.player;
				root.right = delete(root.right, temp.score);
			}
		}

		if (root == null)
			return root;

		root.height = Math.max(height(root.left), height(root.right)) + 1;

		int balance = getBalance(root);

		// LL
		if (balance > 1 && getBalance(root.left) >= 0)
			return rightRotate(root);

		// LR
		if (balance > 1 && getBalance(root.left) < 0) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}

		// RR
		if (balance < -1 && getBalance(root.right) <= 0)
			return leftRotate(root);

		// RL
		if (balance < -1 && getBalance(root.right) > 0) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}

		return root;
	}

	/* ================= DISPLAY TOP PLAYERS ================= */
	static void displayTop(Node root, int[] count) {

		if (root == null || count[0] >= 10)
			return;

		displayTop(root.right, count);

		if (count[0] < 10) {
			System.out.println("#" + (count[0] + 1) + " | Player: " + root.player + " | Score: " + root.score);
			count[0]++;
		}

		displayTop(root.left, count);
	}

	/* ================= MAIN ================= */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\n Gaming Leaderboard (AVL)");
			System.out.println("1. Insert / Update Player");
			System.out.println("2. Display Top 10 Players");
			System.out.println("3. Remove Player");
			System.out.println("4. Exit");
			System.out.print("Choose option: ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				sc.nextLine();
				System.out.print("Enter player name: ");
				String name = sc.nextLine();
				System.out.print("Enter score: ");
				int score = sc.nextInt();
				root = insert(root, score, name);
				System.out.println(" Player updated");
				break;

			case 2:
				System.out.println("\n🏆 Top Players:");
				displayTop(root, new int[] { 0 });
				break;

			case 3:
				System.out.print("Enter score to remove: ");
				score = sc.nextInt();
				root = delete(root, score);
				System.out.println(" Player removed");
				break;

			case 4:
				sc.close();
				return;

			default:
				System.out.println(" Invalid option");
			}
		}
	}
}
