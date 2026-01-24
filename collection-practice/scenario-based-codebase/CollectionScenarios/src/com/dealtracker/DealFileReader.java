package com.dealtracker;

import java.io.*;
import java.util.*;

/**
 * DealFileReader 
 * ---------------- 
 * Reads raw deal data from a text file using
 * FileInputStream.
 */
public class DealFileReader {

	public static List<String> readFile(String filePath) throws IOException {

		List<String> lines = new ArrayList<>();
		FileInputStream fis = new FileInputStream(filePath);

		StringBuilder sb = new StringBuilder();
		int ch;

		while ((ch = fis.read()) != -1) {
			if (ch == '\n') {
				lines.add(sb.toString().trim());
				sb.setLength(0);
			} else {
				sb.append((char) ch);
			}
		}

		if (sb.length() > 0) {
			lines.add(sb.toString().trim());
		}

		fis.close();
		return lines;
	}
}
