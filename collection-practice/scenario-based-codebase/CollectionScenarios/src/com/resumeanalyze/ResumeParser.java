package com.resumeanalyze;

import java.util.*;
import java.util.regex.*;

/**
 * ResumeParser ------------- Handles parsing resume content using Regular
 * Expressions. Extracts email, phone number, technical keywords, and performs
 * validation checks.
 */
public class ResumeParser {

	
	// Regex patterns
	private static final Pattern EMAIL_PATTERN = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+");

	private static final Pattern PHONE_PATTERN = Pattern.compile("\\b\\d{10}\\b");

	private static final List<String> KEYWORDS = Arrays.asList("java", "python", "spring");

	// Parses resume text and extracts data
	public static ResumeData parse(String content) throws ResumeException {

		Matcher emailMatcher = EMAIL_PATTERN.matcher(content);
		Matcher phoneMatcher = PHONE_PATTERN.matcher(content);

		if (!emailMatcher.find() || !phoneMatcher.find()) {
			throw new ResumeException("Invalid resume format");
		}

		String email = emailMatcher.group();
		String phone = phoneMatcher.group();

		List<String> skills = new ArrayList<>();
		int keywordCount = 0;

		String lowerContent = content.toLowerCase();

		for (String skill : KEYWORDS) {
			if (lowerContent.contains(skill)) {
				skills.add(skill);
				keywordCount++;
			}
		}

		return new ResumeData(email, phone, skills, keywordCount);
	}
}
