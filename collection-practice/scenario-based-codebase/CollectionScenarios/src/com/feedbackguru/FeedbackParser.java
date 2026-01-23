package com.feedbackguru;

import java.util.regex.*;

/**
 * FeedbackParser --------------- Uses Regular Expressions to extract ratings
 * from feedback text and creates Feedback objects.
 */
public class FeedbackParser {

	// Regex to extract ratings like 7/10, 9/10
	private static final Pattern RATING_PATTERN = Pattern.compile("(\\d{1,2})/10");

	public static Feedback<String> parse(String line) {

		try {
			Matcher matcher = RATING_PATTERN.matcher(line);

			if (matcher.find()) {
				int rating = Integer.parseInt(matcher.group(1));
				return new Feedback<>("Service", line, rating);
			}

			// No rating found
			return new Feedback<>("Service", line, -1);

		} catch (Exception e) {
			// Graceful handling of malformed lines
			return new Feedback<>("Service", line, -1);
		}
	}
}
