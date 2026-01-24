package com.examresultuploader;

import java.io.*;
import java.util.*;

/**
 * ResultFileReader 
 * ----------------- 
 * Reads exam result CSV files line by line
 * using BufferedReader.
 */
public class ResultFileReader {

	public static List<String> readFile(String filePath) throws IOException {

		List<String> lines = new ArrayList<>();

		BufferedReader br = new BufferedReader(new FileReader(filePath));

		String line;
		while ((line = br.readLine()) != null) {
			lines.add(line);
		}

		br.close();
		return lines;
	}
}
