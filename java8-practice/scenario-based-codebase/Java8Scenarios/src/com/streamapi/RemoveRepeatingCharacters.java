package com.streamapi;

import java.util.stream.Collectors;

public class RemoveRepeatingCharacters {

	public static void main(String[] args) {

		String input = "aabbccdde";

		String result = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1) // Count exactly one
				.map(e -> String.valueOf(e.getKey())).collect(Collectors.joining());

		System.out.println(result);

	}

}
