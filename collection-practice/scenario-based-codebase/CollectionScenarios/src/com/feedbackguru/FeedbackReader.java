package com.feedbackguru;

import java.io.*;
import java.util.*;

/**
 * FeedbackReader:  Reads feedback lines from all .txt files
 * present in a given directory using IO streams.
 */
public class FeedbackReader {

	public static List<String> readFeedbackFiles(String folderPath) throws IOException {

		List<String> lines = new ArrayList<>();
		File folder = new File(folderPath);

		File[] files = folder.listFiles();

		for (File file : files) {

			if (!file.getName().endsWith(".txt")) {
				continue;
			}

			BufferedReader br = new BufferedReader(new FileReader(file));

			String line;
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}

			br.close();
		}

		return lines;
	}
}
