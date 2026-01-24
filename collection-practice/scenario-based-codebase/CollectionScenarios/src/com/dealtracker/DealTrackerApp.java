package com.dealtracker;

import java.util.*;
import java.io.*;

/**
 * DealTrackerApp 
 * ---------------- 
 * Main driver class for DealTracker system.
 * Reads deal files, validates, removes duplicates, sorts, and displays active
 * deals.
 */
public class DealTrackerApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter deal file path: ");
		String filePath = sc.nextLine();

		Map<String, Deal> dealMap = new HashMap<>();
		Set<String> seenCodes = new HashSet<>();

		try {
			List<String> lines = DealFileReader.readFile(filePath);

			StringBuilder block = new StringBuilder();

			for (String line : lines) {

				if (line.isEmpty()) {
					Deal deal = DealParser.parse(block.toString());

					if (deal != null && DealValidator.isValid(deal) && seenCodes.add(deal.getCode())) {

						dealMap.put(deal.getCode(), deal);
					}
					block.setLength(0);
				} else {
					block.append(line).append("\n");
				}
			}

			// Final block
			Deal deal = DealParser.parse(block.toString());
			if (deal != null && DealValidator.isValid(deal) && seenCodes.add(deal.getCode())) {

				dealMap.put(deal.getCode(), deal);
			}

			System.out.println("\n===== ACTIVE DEALS =====\n");

			DealSorter.sortByDiscount(dealMap.values()).forEach(System.out::println);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
