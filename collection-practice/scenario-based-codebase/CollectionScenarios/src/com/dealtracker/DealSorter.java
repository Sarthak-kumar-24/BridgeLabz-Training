package com.dealtracker;

import java.util.*;

/**
 * DealSorter 
 * ----------- 
 * Provides sorting utilities for deals.
 */
public class DealSorter {

	public static List<Deal> sortByDiscount(Collection<Deal> deals) {

		List<Deal> list = new ArrayList<>(deals);

		list.sort(Comparator.comparingInt(Deal::getDiscount).reversed());
		return list;
	}
}
