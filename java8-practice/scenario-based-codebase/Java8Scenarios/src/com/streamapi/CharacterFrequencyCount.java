package com.streamapi;

import java.util.*;
import java.util.stream.*;

public class CharacterFrequencyCount {

	public static void main(String[] args) {

		String input = "banana";

		Map<Character, Long> frequencyMap = input.chars() // Convert String to IntStream
				.mapToObj(c -> (char) c) // Convert int to Character
				.collect(Collectors.groupingBy(c -> c, // Key = character itself
						Collectors.counting() // Count occurrences
				));

		System.out.println(frequencyMap);
	}
}
