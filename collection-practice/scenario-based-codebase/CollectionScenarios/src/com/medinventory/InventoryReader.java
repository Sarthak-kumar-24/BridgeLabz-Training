package com.medinventory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InventoryReader 
 * ---------------------
 *  Reads inventory data from CSV files using
 *  BufferedReader.
 */
public class InventoryReader {

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
