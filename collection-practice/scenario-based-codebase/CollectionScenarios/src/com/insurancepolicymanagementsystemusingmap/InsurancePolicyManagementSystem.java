package com.insurancepolicymanagementsystemusingmap;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class InsurancePolicyManagementSystem {

	// Maps for different purposes
	private static Map<Integer, InsurancePolicy> hashMap = new HashMap<>();
	private static Map<Integer, InsurancePolicy> linkedHashMap = new LinkedHashMap<>();
	private static TreeMap<LocalDate, List<InsurancePolicy>> treeMap = new TreeMap<>();

	private static Scanner sc = new Scanner(System.in);

	// Add policy to all maps
	private static void addPolicy() {

		System.out.print("Enter Policy Number: ");
		int number = sc.nextInt();
		sc.nextLine();

		if (hashMap.containsKey(number)) {
			System.out.println(" Policy number already exists!");
			return;
		}

		System.out.print("Enter Policy Holder Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Expiry Date (yyyy-mm-dd): ");
		LocalDate expiry = LocalDate.parse(sc.nextLine());

		System.out.print("Enter Coverage Type (Health/Auto/Home): ");
		String coverage = sc.nextLine();

		System.out.print("Enter Premium Amount: ");
		double premium = sc.nextDouble();

		InsurancePolicy policy = new InsurancePolicy(number, name, expiry, coverage, premium);

		// HashMap & LinkedHashMap
		hashMap.put(number, policy);
		linkedHashMap.put(number, policy);

		// TreeMap (grouped by expiry date)
		treeMap.putIfAbsent(expiry, new ArrayList<>());
		treeMap.get(expiry).add(policy);

		System.out.println(" Policy added successfully");
	}

	// Retrieve policy by number
	private static void getPolicyByNumber() {
		System.out.print("Enter Policy Number: ");
		int number = sc.nextInt();

		InsurancePolicy policy = hashMap.get(number);
		if (policy == null) {
			System.out.println(" Policy not found");
		} else {
			System.out.println(policy);
		}
	}

	// Policies expiring in next 30 days
	private static void policiesExpiringSoon() {
		LocalDate today = LocalDate.now();
		System.out.println("\nPolicies expiring within 30 days:");

		for (InsurancePolicy p : hashMap.values()) {
			long days = ChronoUnit.DAYS.between(today, p.expiryDate);
			if (days >= 0 && days <= 30) {
				System.out.println(p);
			}
		}
	}

	// Policies for specific policyholder
	private static void policiesByHolder() {
		sc.nextLine();
		System.out.print("Enter Policy Holder Name: ");
		String name = sc.nextLine();

		boolean found = false;
		for (InsurancePolicy p : hashMap.values()) {
			if (p.policyHolderName.equalsIgnoreCase(name)) {
				System.out.println(p);
				found = true;
			}
		}

		if (!found) {
			System.out.println(" No policies found for this policyholder");
		}
	}

	// Remove expired policies
	private static void removeExpiredPolicies() {
		LocalDate today = LocalDate.now();

		Iterator<Map.Entry<Integer, InsurancePolicy>> it = hashMap.entrySet().iterator();

		while (it.hasNext()) {
			InsurancePolicy p = it.next().getValue();
			if (p.expiryDate.isBefore(today)) {
				it.remove();
				linkedHashMap.remove(p.policyNumber);
				treeMap.get(p.expiryDate).remove(p);
			}
		}

		System.out.println(" Expired policies removed");
	}

	// Display policies in insertion order
	private static void displayInsertionOrder() {
		for (InsurancePolicy p : linkedHashMap.values()) {
			System.out.println(p);
		}
	}

	// Display policies sorted by expiry date
	private static void displaySortedByExpiry() {
		for (Map.Entry<LocalDate, List<InsurancePolicy>> entry : treeMap.entrySet()) {
			for (InsurancePolicy p : entry.getValue()) {
				System.out.println(p);
			}
		}
	}

	// Menu-driven system
	public static void main(String[] args) {

		while (true) {
			System.out.println("\n====== Insurance Policy Management System ======");
			System.out.println("1. Add Policy");
			System.out.println("2. Retrieve Policy by Number");
			System.out.println("3. Policies Expiring in Next 30 Days");
			System.out.println("4. Policies by Policyholder");
			System.out.println("5. Remove Expired Policies");
			System.out.println("6. Display Policies (Insertion Order)");
			System.out.println("7. Display Policies (Sorted by Expiry)");
			System.out.println("8. Exit");
			System.out.print("Choose option: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1 -> addPolicy();
			case 2 -> getPolicyByNumber();
			case 3 -> policiesExpiringSoon();
			case 4 -> policiesByHolder();
			case 5 -> removeExpiredPolicies();
			case 6 -> displayInsertionOrder();
			case 7 -> displaySortedByExpiry();
			case 8 -> {
				System.out.println("System exited successfully");
				return;
			}
			default -> System.out.println("Invalid choice");
			}
		}
	}

}
