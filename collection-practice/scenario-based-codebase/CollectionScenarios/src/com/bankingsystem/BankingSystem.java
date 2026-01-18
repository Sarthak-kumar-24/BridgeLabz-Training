package com.bankingsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * Banking System Implementation
 * Uses HashMap, TreeMap, and Queue
 */
public class BankingSystem {
	
    // Stores account number -> balance
    private static HashMap<Integer, Double> accountMap = new HashMap<>();

    // Queue to process withdrawal requests (FIFO)
    private static Queue<Integer> withdrawalQueue = new LinkedList<>();

    private static Scanner sc = new Scanner(System.in);

    // Create a new account
    private static void createAccount() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        if (accountMap.containsKey(accNo)) {
            System.out.println(" Account already exists!");
            return;
        }

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        accountMap.put(accNo, balance);
        System.out.println(" Account created successfully");
    }

    // Deposit money
    private static void deposit() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        if (!accountMap.containsKey(accNo)) {
            System.out.println(" Account not found");
            return;
        }

        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();

        accountMap.put(accNo, accountMap.get(accNo) + amount);
        System.out.println(" Amount deposited successfully");
    }

    // Request withdrawal (added to queue)
    private static void requestWithdrawal() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        if (!accountMap.containsKey(accNo)) {
            System.out.println(" Account not found");
            return;
        }

        withdrawalQueue.add(accNo);
        System.out.println(" Withdrawal request added to queue");
    }

    // Process withdrawal requests
    private static void processWithdrawals() {
        if (withdrawalQueue.isEmpty()) {
            System.out.println("No pending withdrawal requests");
            return;
        }

        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();

        int accNo = withdrawalQueue.poll();
        double balance = accountMap.get(accNo);

        if (balance >= amount) {
            accountMap.put(accNo, balance - amount);
            System.out.println(" Withdrawal successful for Account: " + accNo);
        } else {
            System.out.println(" Insufficient balance for Account: " + accNo);
        }
    }

    // Display all accounts
    private static void displayAccounts() {
        System.out.println("\nCustomer Accounts:");
        for (Map.Entry<Integer, Double> entry : accountMap.entrySet()) {
            System.out.println("Account: " + entry.getKey() +
                               " | Balance: Rs" + entry.getValue());
        }
    }

    // Display customers sorted by balance
    private static void displaySortedByBalance() {
        TreeMap<Double, List<Integer>> sortedMap = new TreeMap<>();

        for (Map.Entry<Integer, Double> entry : accountMap.entrySet()) {
            sortedMap.putIfAbsent(entry.getValue(), new ArrayList<>());
            sortedMap.get(entry.getValue()).add(entry.getKey());
        }

        System.out.println("\nCustomers Sorted by Balance:");
        for (Map.Entry<Double, List<Integer>> entry : sortedMap.entrySet()) {
            for (int accNo : entry.getValue()) {
                System.out.println("Account: " + accNo +
                                   " | Balance: Rs" + entry.getKey());
            }
        }
    }

    // Menu-driven program
    public static void main(String[] args) {

        while (true) {
            System.out.println("\n====== Banking System Menu ======");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Request Withdrawal");
            System.out.println("4. Process Withdrawal");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Display Customers Sorted by Balance");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> deposit();
                case 3 -> requestWithdrawal();
                case 4 -> processWithdrawals();
                case 5 -> displayAccounts();
                case 6 -> displaySortedByBalance();
                case 7 -> {
                    System.out.println(" Banking system closed.");
                    return;
                }
                default -> System.out.println(" Invalid choice");
            }
        }
    }

}
