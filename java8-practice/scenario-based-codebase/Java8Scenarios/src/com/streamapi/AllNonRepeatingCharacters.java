package com.streamapi;

import java.util.*;
import java.util.stream.*;

public class AllNonRepeatingCharacters {

	public static void main(String[] args) {

		String input = "programming";

		input.chars()
		     .mapToObj(c -> (char) c)
		     .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
		     .entrySet()
			 .stream()
			 .filter(e -> e.getValue() == 1) // Only characters appearing once
			 .map(Map.Entry::getKey)
			 .forEach(c -> System.out.print(c + " "));
	}

}
