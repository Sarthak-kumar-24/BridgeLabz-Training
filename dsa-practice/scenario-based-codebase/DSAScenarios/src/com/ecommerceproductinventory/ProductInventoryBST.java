package com.ecommerceproductinventory;

import java.util.Scanner;

/*
 * ProductInventoryBST
 * -------------------
 * Manages e-commerce products using a
 * Binary Search Tree (BST) based on SKU.
 */
public class ProductInventoryBST {

	private static Product root = null;

	/* ================= INSERT PRODUCT ================= */
	private static Product insert(Product root, int sku, String name, double price) {

		if (root == null)
			return new Product(sku, name, price);

		if (sku < root.sku)
			root.left = insert(root.left, sku, name, price);
		else if (sku > root.sku)
			root.right = insert(root.right, sku, name, price);

		return root;
	}

	/* ================= SEARCH PRODUCT ================= */
	private static Product search(Product root, int sku) {

		if (root == null || root.sku == sku)
			return root;

		if (sku < root.sku)
			return search(root.left, sku);

		return search(root.right, sku);
	}

	/* ================= UPDATE PRICE ================= */
	private static void updatePrice(int sku, double newPrice) {

		Product product = search(root, sku);

		if (product == null) {
			System.out.println(" Product not found");
		} else {
			product.price = newPrice;
			System.out.println(" Price updated successfully");
		}
	}

	/* ================= INORDER (SORTED LIST) ================= */
	private static void displaySorted(Product root) {

		if (root != null) {
			displaySorted(root.left);
			System.out.println("SKU: " + root.sku + " | Name: " + root.name + " | Price: ₹" + root.price);
			displaySorted(root.right);
		}
	}

	/* ================= MAIN ================= */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\n E-Commerce Inventory System");
			System.out.println("1. Add Product");
			System.out.println("2. Lookup Product");
			System.out.println("3. Update Product Price");
			System.out.println("4. Display Products (Sorted by SKU)");
			System.out.println("5. Exit");
			System.out.print("Choose option: ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter SKU: ");
				int sku = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter product name: ");
				String name = sc.nextLine();
				System.out.print("Enter price: ");
				double price = sc.nextDouble();

				root = insert(root, sku, name, price);
				System.out.println(" Product added");
				break;

			case 2:
				System.out.print("Enter SKU to search: ");
				sku = sc.nextInt();
				Product p = search(root, sku);

				if (p == null) {
					System.out.println(" Product not found");
				} else {
					System.out.println(" Found → SKU: " + p.sku + ", Name: " + p.name + ", Price: ₹" + p.price);
				}
				break;

			case 3:
				System.out.print("Enter SKU: ");
				sku = sc.nextInt();
				System.out.print("Enter new price: ");
				double newPrice = sc.nextDouble();
				updatePrice(sku, newPrice);
				break;

			case 4:
				System.out.println("\n Product List (Sorted by SKU):");
				displaySorted(root);
				break;

			case 5:
				System.out.println(" Inventory system closed");
				sc.close();
				return;

			default:
				System.out.println(" Invalid choice");
			}
		}
	}
}
