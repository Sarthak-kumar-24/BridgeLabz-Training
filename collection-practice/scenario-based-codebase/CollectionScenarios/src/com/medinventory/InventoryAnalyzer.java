package com.medinventory;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.*;

/**
 * InventoryAnalyzer 
 * ------------------ 
 * Analyzes inventory items for expiry,
 * categorization, duplicates, and low stock.
 */
public class InventoryAnalyzer {

	// Regex for dd-MM-yyyy
	private static final Pattern DATE_PATTERN = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	public static Map<String, List<Item<String>>> analyze(List<String> lines) throws LowStockException {

		Set<Item<String>> uniqueItems = new HashSet<>();
		Map<String, List<Item<String>>> categoryMap = new HashMap<>();

		for (String line : lines) {

			try {
				String[] parts = line.split(",");

				String id = parts[0];
				String name = parts[1];
				int qty = Integer.parseInt(parts[2]);
				String expiry = parts[3];
				String category = parts[4];

				// Validates expiry format
				if (!DATE_PATTERN.matcher(expiry).matches()) {
					continue;
				}

				Item<String> item = new Item<>(id, name, qty, expiry, category);

				// Check low stock
				if (qty < 10) {
					throw new LowStockException("CRITICAL LOW STOCK: " + item);
				}

				
				// Check expiry
				LocalDate expDate = LocalDate.parse(expiry, FORMATTER);

				if (expDate.isBefore(LocalDate.now())) {
					System.out.println("EXPIRED ITEM: " + item);
				}

				uniqueItems.add(item);

			} catch (Exception e) {
				System.out.println("Skipping invalid line: " + line);
			}
		}

		// Categorize items
		for (Item<String> item : uniqueItems) {
			categoryMap.computeIfAbsent(item.getCategory(), k -> new ArrayList<>()).add(item);
		}

		return categoryMap;
	}
}
