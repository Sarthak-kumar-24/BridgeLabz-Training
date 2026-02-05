package com.streamapi;

import java.util.stream.*;

public class KeepOnlyDigits {

	public static void main(String[] args) {

		String input = "orderId=AB123XZ9";

		String result = input.chars().filter(Character::isDigit) // Keep only digits
				.mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());

		System.out.println(result);

	}

}
