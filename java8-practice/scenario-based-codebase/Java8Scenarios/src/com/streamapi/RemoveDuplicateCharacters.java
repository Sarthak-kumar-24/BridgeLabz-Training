package com.streamapi;

import java.util.stream.*;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {

		String input = "banana";

		String result = input.chars().distinct() // Remove duplicate chars
				.mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining()); // Join back to String

		System.out.println(result);
	}

}
