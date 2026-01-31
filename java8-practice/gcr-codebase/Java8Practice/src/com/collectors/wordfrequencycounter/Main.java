package com.collectors.wordfrequencycounter;

import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {

		// Input paragraph
		String text = "Java is great and Java is powerful and Java is fast";

		//  Core Logic — Word Frequency using toMap()
		Map<String, Integer> freqMap = Arrays.stream(text.split("\\s+"))

				// convert to lowercase for correct counting (Java == java)
				.map(word -> word.toLowerCase())

				// Collect into Map<word, count>
				.collect(Collectors.toMap(

						// key mapper → word itself
						word -> word,

						// value mapper → initial count = 1
						word -> 1,

						// merge function → if word repeats, add counts
						(count1, count2) -> count1 + count2));

		// Print result
		System.out.println(freqMap);
	}
}
