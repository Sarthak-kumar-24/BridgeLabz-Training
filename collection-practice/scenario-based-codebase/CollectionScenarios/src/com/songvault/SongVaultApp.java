package com.songvault;

import java.util.*;

/**
 * SongVaultApp 
 * ------------- 
 * Main driver class for SongVault system. Reads song
 * files, builds library, and displays organized music data.
 */
public class SongVaultApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter songs folder path: ");
		String folderPath = sc.nextLine();

		SongLibrary library = new SongLibrary();

		try {
			List<String> lines = SongFileReader.readSongFiles(folderPath);

			StringBuilder block = new StringBuilder();

			for (String line : lines) {
				if (line.equals("---")) {
					library.addSong(SongParser.parse(block.toString()));
					block.setLength(0);
				} else {
					block.append(line).append("\n");
				}
			}

			// Display results
			System.out.println("\n===== SONG VAULT =====\n");

			System.out.println("Unique Artists:");
			library.getUniqueArtists().forEach(System.out::println);

			System.out.println("\nSongs Grouped by Genre:");
			library.groupByGenre().forEach((k, v) -> {
				System.out.println(k + ":");
				v.forEach(s -> System.out.println(" - " + s));
			});

			System.out.println("\nSongs Sorted by Title:");
			library.sortByTitle().forEach(System.out::println);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
