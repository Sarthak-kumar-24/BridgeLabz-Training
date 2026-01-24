package com.examresultuploader;

import java.util.regex.*;

/**
 * ResultValidator 
 * ---------------- 
 * Validates CSV result lines using Regex.
 */
public class ResultValidator {

	// RollNo,Name,Subject,Marks (0-100)
	private static final Pattern LINE_PATTERN = Pattern.compile("\\d+,[A-Za-z ]+,[A-Za-z]+,(100|[1-9]?\\d)");

	public static void validate(String line) throws InvalidResultFormatException {

		if (!LINE_PATTERN.matcher(line).matches()) {
			throw new InvalidResultFormatException("Invalid result format: " + line);
		}
	}
}
