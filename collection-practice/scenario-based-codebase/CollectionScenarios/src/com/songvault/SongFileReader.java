package com.songvault;

import java.io.*;
import java.util.*;

/**
 * SongFileReader 
 * ---------------- 
 * Reads all song text files from a folder using
 * BufferedReader.
 */
public class SongFileReader {

	public static List<String> readSongFiles(String folderPath) throws IOException {

		List<String> contents = new ArrayList<>();
		File folder = new File(folderPath);

		for (File file : folder.listFiles()) {

			if (!file.getName().endsWith(".txt")) {
				continue;
			}

			BufferedReader br = new BufferedReader(new FileReader(file));

			String line;
			while ((line = br.readLine()) != null) {
				contents.add(line);
			}

			br.close();
			contents.add("---"); // separator between songs
		}

		return contents;
	}
}
