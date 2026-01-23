package com.examscanner;

/**
 * ParsedLine
 * -----------
 * Helper class to store parsed student data.
 */
public class ParsedLine {
    String name;
    char[] answers;

    ParsedLine(String name, char[] answers) {
        this.name = name;
        this.answers = answers;
    }
}
