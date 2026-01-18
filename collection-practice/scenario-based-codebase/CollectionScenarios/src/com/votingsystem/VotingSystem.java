package com.votingsystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * Voting System using Maps
 */
public class VotingSystem {
	
    // Stores total votes per candidate (fast lookup)
    private static HashMap<String, Integer> voteCountMap = new HashMap<>();

    // Maintains the order in which votes are cast
    private static LinkedHashMap<Integer, String> voteOrderMap = new LinkedHashMap<>();

    // Scanner for user input
    private static Scanner sc = new Scanner(System.in);

    private static int voteNumber = 1;
    
    // Cast a vote
    private static void castVote() {
        sc.nextLine();
        System.out.print("Enter Candidate Name: ");
        String candidate = sc.nextLine();

        // Update vote count
        voteCountMap.put(candidate, voteCountMap.getOrDefault(candidate, 0) + 1);

        // Maintain vote order
        voteOrderMap.put(voteNumber++, candidate);

        System.out.println(" Vote cast successfully");
    }
    
    // Display vote counts (HashMap)
    private static void displayVoteCounts() {
        System.out.println("\nVote Count (Unsorted):");
        for (Map.Entry<String, Integer> entry : voteCountMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Display results in sorted order (TreeMap)
    private static void displaySortedResults() {
        TreeMap<String, Integer> sortedResults = new TreeMap<>(voteCountMap);

        System.out.println("\nVoting Results (Sorted by Candidate Name):");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    
    // Display order of votes
    private static void displayVoteOrder() {
        System.out.println("\nVote Casting Order:");
        for (Map.Entry<Integer, String> entry : voteOrderMap.entrySet()) {
            System.out.println("Vote " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Menu-driven program
    public static void main(String[] args) {

        while (true) {
            System.out.println("\n====== Voting System Menu ======");
            System.out.println("1. Cast Vote");
            System.out.println("2. Display Vote Count");
            System.out.println("3. Display Sorted Results");
            System.out.println("4. Display Vote Order");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> castVote();
                case 2 -> displayVoteCounts();
                case 3 -> displaySortedResults();
                case 4 -> displayVoteOrder();
                case 5 -> {
                    System.out.println("Voting system closed.");
                    return;
                }
                default -> System.out.println(" Invalid option. Try again.");
            }
        }
    }

}
