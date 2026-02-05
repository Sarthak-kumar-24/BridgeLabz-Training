package com.streamapi;

import java.util.*;
import java.util.stream.*;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		String input = "stress";

		Character result = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, // Preserve insertion order
						Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1) // Keep only non-repeating
				.map(Map.Entry::getKey).findFirst().orElse(null);

		System.out.println(result);

	}

}
