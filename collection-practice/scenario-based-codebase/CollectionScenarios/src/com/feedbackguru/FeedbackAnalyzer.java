package com.feedbackguru;

import java.util.*;

/**
 * FeedbackAnalyzer ----------------- Groups feedback into Positive, Neutral,
 * and Negative categories using Maps and Lists.
 */
public class FeedbackAnalyzer {

	public static Map<String, List<String>> analyze(List<Feedback<String>> feedbackList) {

		Map<String, List<String>> result = new HashMap<>();

		result.put("Positive", new ArrayList<>());
		result.put("Neutral", new ArrayList<>());
		result.put("Negative", new ArrayList<>());

		for (Feedback<String> feedback : feedbackList) {

			int rating = feedback.getRating();

			if (rating >= 8) {
				result.get("Positive").add(feedback.getMessage());
			} else if (rating >= 5) {
				result.get("Neutral").add(feedback.getMessage());
			} else {
				result.get("Negative").add(feedback.getMessage());
			}
		}

		return result;
	}
}
