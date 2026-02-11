package com.jdbc.transactionmanagement;

import java.util.Scanner;

/*
 * Main banking application
 */
public class BankApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BankDAO dao = new BankDAO();

		while (true) {

			System.out.println("\n--- Banking System ---");
			System.out.println("1. Check Balance");
			System.out.println("2. Transfer Money");
			System.out.println("3. Transaction History");
			System.out.println("4. Exit");
			System.out.print("Choose option: ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter account ID: ");
				int accId = sc.nextInt();
				dao.checkBalance(accId);
				break;

			case 2:
				System.out.print("From Account: ");
				int from = sc.nextInt();

				System.out.print("To Account: ");
				int to = sc.nextInt();

				System.out.print("Amount: ");
				double amt = sc.nextDouble();

				dao.transferMoney(from, to, amt);
				break;

			case 3:
				dao.showTransactionHistory();
				break;

			case 4:
				System.out.println("Exiting banking system...");
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
