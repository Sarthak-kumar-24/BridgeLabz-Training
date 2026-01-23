package com.resumeanalyze;

import java.io.*;

/**
 * ResumeReader ------------- Responsible for reading resume files from disk
 * using Java I/O Streams and returning their content as a single String.
 */
public class ResumeReader {

	// Reads entire resume content as String
	public static String readResume(File file) throws IOException {
		StringBuilder content = new StringBuilder();

		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;

		while ((line = br.readLine()) != null) {
			content.append(line).append(" ");
		}

		br.close();
		return content.toString();
	}
}
