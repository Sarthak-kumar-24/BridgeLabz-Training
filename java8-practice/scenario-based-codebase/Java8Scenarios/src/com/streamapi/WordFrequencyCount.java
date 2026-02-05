package com.streamapi;

import java.util.*;
import java.util.stream.*;

public class WordFrequencyCount {

	public static void main(String[] args) {

		String input = "java is java and java is fast";

		Map<String, Long> wordCount = Arrays.stream(input.split(" ")) // Convert sentence to Stream<String>
				.collect(Collectors.groupingBy(word -> word, // Key = word
						Collectors.counting() // Count each word
				));

		System.out.println(wordCount);
	}
}
