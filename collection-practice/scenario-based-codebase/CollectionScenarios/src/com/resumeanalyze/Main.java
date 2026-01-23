package com.resumeanalyze;

import java.io.File;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter resume folder path: ");
		String folderPath = sc.nextLine();

		File folder = new File(folderPath);

		// Email -> ResumeData
		Map<String, ResumeData> resumeMap = new HashMap<>();

		if (!folder.exists() || !folder.isDirectory()) {
			System.out.println("Invalid folder path");
			return;
		}

		File[] files = folder.listFiles();

		for (File file : files) {

			try {
				// Skip non-txt files
				if (!file.getName().endsWith(".txt")) {
					throw new ResumeException("Unsupported file format");
				}

				String content = ResumeReader.readResume(file);
				ResumeData data = ResumeParser.parse(content);

				resumeMap.put(data.getEmail(), data);

			} catch (ResumeException e) {
				System.out.println("Skipping " + file.getName() + " -> " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Error reading " + file.getName());
			}
		}

		// Convert Map -> List for sorting
		List<ResumeData> sortedCandidates = new ArrayList<>(resumeMap.values());

		// Sort by keyword match count (DESC)
		sortedCandidates.sort((a, b) -> b.getKeywordCount() - a.getKeywordCount());

		// Display results
		System.out.println("\n===== SORTED CANDIDATES =====\n");

		for (ResumeData data : sortedCandidates) {
			System.out.println(data);
			System.out.println("---------------------------");
		}
	}

}
