package com.dealtracker;

import java.time.LocalDate;

/**
 * DealValidator 
 * -------------- 
 * Validates deals based on expiry date.
 */
public class DealValidator {

	public static boolean isValid(Deal deal) {
		return !deal.getValidTill().isBefore(LocalDate.now());
	}
}
