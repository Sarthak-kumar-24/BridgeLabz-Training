package com.coderepocleaner;

import java.io.File;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.*;

/**
 * CodeRepoCleanerApp ------------------ Main driver class that scans Java
 * repositories, analyzes files, categorizes them, and applies stream-based
 * filtering.
 */
public class CodeRepoCleanerApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter root source folder: ");
		String root = sc.nextLine();

		try {
			List<Path> paths = JavaFileScanner.scan(root);

			// Filter files larger than 1KB using streams
			List<Path> filtered = paths.stream().filter(p -> p.toFile().length() > 1024).collect(Collectors.toList());

			Map<FileType, List<File>> categorized = FileCategorizer.categorize(filtered);

			System.out.println("\n===== CODE REPO CLEAN REPORT =====\n");

			for (Map.Entry<FileType, List<File>> entry : categorized.entrySet()) {

				System.out.println(entry.getKey() + " FILES:");
				for (File f : entry.getValue()) {
					System.out.println(" - " + f.getName());
				}
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println("Error scanning repository: " + e.getMessage());
		}
	}
}
