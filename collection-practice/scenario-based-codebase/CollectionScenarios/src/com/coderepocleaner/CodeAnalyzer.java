package com.coderepocleaner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

/**
 * CodeAnalyzer ------------- Analyzes Java source files using Regex to detect
 * naming violations and unused imports.
 */
public class CodeAnalyzer {

	// camelCase method name pattern
	private static final Pattern METHOD_PATTERN = Pattern.compile("void\\s+([A-Z][a-zA-Z0-9_]*)\\s*\\(");

	private static final Pattern IMPORT_PATTERN = Pattern.compile("import\\s+([a-zA-Z0-9_.]+);");

	public static FileType analyze(File file) {

		boolean hasError = false;
		boolean hasWarning = false;

		Set<String> imports = new HashSet<>();
		String content = "";

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			String line;
			StringBuilder sb = new StringBuilder();

			while ((line = br.readLine()) != null) {
				sb.append(line).append("\n");

				Matcher importMatcher = IMPORT_PATTERN.matcher(line);
				if (importMatcher.find()) {
					imports.add(importMatcher.group(1));
				}

				Matcher methodMatcher = METHOD_PATTERN.matcher(line);
				if (methodMatcher.find()) {
					hasError = true; // violates camelCase
				}
			}

			content = sb.toString();

			// Detect unused imports
			for (String imp : imports) {
				String className = imp.substring(imp.lastIndexOf('.') + 1);
				if (!content.contains(className)) {
					hasWarning = true;
				}
			}

		} catch (IOException e) {
			return FileType.ERRORS;
		}

		if (hasError)
			return FileType.ERRORS;
		if (hasWarning)
			return FileType.WARNINGS;
		return FileType.VALID;
	}
}
