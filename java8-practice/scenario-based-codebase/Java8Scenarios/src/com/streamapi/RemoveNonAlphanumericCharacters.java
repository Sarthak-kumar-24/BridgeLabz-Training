package com.streamapi;

import java.util.stream.*;

public class RemoveNonAlphanumericCharacters {

	public static void main(String[] args) {

		String input = "ja@va#8!!";

		String result = input.chars().filter(Character::isLetterOrDigit) // Keep only letters & digits
				.mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());

		System.out.println(result);
	}
}
