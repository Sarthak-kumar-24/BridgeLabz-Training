package com.dealtracker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.*;

/**
 * DealParser 
 * ----------- 
 * Uses Regular Expressions to extract deal attributes
 * from raw text.
 */
public class DealParser {

	private static final Pattern CODE = Pattern.compile("DealCode:\\s*(.*)");

	private static final Pattern DATE = Pattern.compile("ValidTill:\\s*(\\d{2}-\\d{2}-\\d{4})");

	private static final Pattern DISCOUNT = Pattern.compile("Discount:\\s*(\\d+)%");

	private static final Pattern MIN_PURCHASE = Pattern.compile("MinimumPurchase:\\s*(\\d+)");

	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	public static Deal parse(String block) {

		Matcher c = CODE.matcher(block);
		Matcher d = DATE.matcher(block);
		Matcher dis = DISCOUNT.matcher(block);
		Matcher min = MIN_PURCHASE.matcher(block);

		if (c.find() && d.find() && dis.find() && min.find()) {

			return new Deal(c.group(1), LocalDate.parse(d.group(1), FORMATTER), Integer.parseInt(dis.group(1)),
					Integer.parseInt(min.group(1)));
		}
		return null;
	}
}
