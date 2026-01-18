package com.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class InsurancePolicyManagementSystem {

	

    // Sets for different purposes
    private static Set<InsurancePolicy> hashSet = new HashSet<>();
    private static Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
    private static Set<InsurancePolicy> treeSet = new TreeSet<>();

    private static Scanner sc = new Scanner(System.in);
    
    private static void addPolicy() {
        System.out.print("Enter Policy Number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Policy Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Expiry Date (yyyy-mm-dd): ");
        LocalDate expiry = LocalDate.parse(sc.nextLine());

        System.out.print("Enter Coverage Type (Health/Auto/Home): ");
        String coverage = sc.nextLine();

        System.out.print("Enter Premium Amount: ");
        double premium = sc.nextDouble();

        InsurancePolicy policy =
                new InsurancePolicy(number, name, expiry, coverage, premium);

        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);

        System.out.println(" Policy added successfully\n");
    }
    
    // Displays all policies
    private static void displayAllPolicies(Set<InsurancePolicy> set) {
        if (set.isEmpty()) {
            System.out.println("No policies available.");
            return;
        }
        for (InsurancePolicy p : set) {
            System.out.println(p);
        }
    }

    // Policies expiring in next 30 days
    private static void policiesExpiringSoon() {
        LocalDate today = LocalDate.now();
        System.out.println("\nPolicies expiring within 30 days:");
        for (InsurancePolicy p : hashSet) {
            long days = ChronoUnit.DAYS.between(today, p.getExpiryDate());
            if (days >= 0 && days <= 30) {
                System.out.println(p);
            }
        }
    }
    
    // Policies by coverage type
    private static void policiesByCoverage() {
        sc.nextLine();
        System.out.print("Enter Coverage Type: ");
        String type = sc.nextLine();

        System.out.println("\nPolicies with coverage: " + type);
        for (InsurancePolicy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }

    // Detect duplicates (simulation using policy numbers)
    private static void detectDuplicates() {
        Set<Integer> seen = new HashSet<>();
        System.out.println("\nDuplicate Policies:");
        for (InsurancePolicy p : linkedHashSet) {
            if (!seen.add(p.getPolicyNumber())) {
                System.out.println(p);
            }
        }
        System.out.println("(HashSet prevents duplicates automatically)");
    }
    
    // Performance comparison
    private static void performanceComparison() {
        InsurancePolicy temp =
                new InsurancePolicy(9999, "Test", LocalDate.now(), "Health", 1000);

        long start, end;

        start = System.nanoTime();
        hashSet.contains(temp);
        end = System.nanoTime();
        System.out.println("HashSet search time: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.contains(temp);
        end = System.nanoTime();
        System.out.println("LinkedHashSet search time: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.contains(temp);
        end = System.nanoTime();
        System.out.println("TreeSet search time: " + (end - start) + " ns");
    }
    
    // Menu-driven program
    public static void main(String[] args) {

        while (true) {
            System.out.println("\n====== Insurance Policy Management ======");
            System.out.println("1. Add Policy");
            System.out.println("2. Display All Policies (HashSet)");
            System.out.println("3. Display Policies in Insertion Order");
            System.out.println("4. Display Policies Sorted by Expiry Date");
            System.out.println("5. Policies Expiring Soon (30 days)");
            System.out.println("6. Policies by Coverage Type");
            System.out.println("7. Detect Duplicate Policies");
            System.out.println("8. Performance Comparison");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addPolicy();
                case 2 -> displayAllPolicies(hashSet);
                case 3 -> displayAllPolicies(linkedHashSet);
                case 4 -> displayAllPolicies(treeSet);
                case 5 -> policiesExpiringSoon();
                case 6 -> policiesByCoverage();
                case 7 -> detectDuplicates();
                case 8 -> performanceComparison();
                case 9 -> {
                    System.out.println("Exiting system. Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
