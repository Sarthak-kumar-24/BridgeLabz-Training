package com.examscanner;

import java.io.*;
import java.util.regex.*;

/**
 * ExamScannerUtil
 * ----------------
 * Reads CSV lines, validates formatting using Regex,
 * and extracts student answers safely.
 */
public class ExamScannerUtil {

    // Regex: Name followed by answers A-D separated by commas
    private static final Pattern LINE_PATTERN =
            Pattern.compile("^[A-Za-z ]+(,(A|B|C|D)){7}$");

    public static ParsedLine parseLine(String line)
            throws IllegalArgumentException {

        Matcher matcher = LINE_PATTERN.matcher(line);

        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid format");
        }

        String[] parts = line.split(",");

        String studentName = parts[0];
        char[] answers = new char[parts.length - 1];

        for (int i = 1; i < parts.length; i++) {
            answers[i - 1] = parts[i].charAt(0);
        }

        return new ParsedLine(studentName, answers);
    }
}
