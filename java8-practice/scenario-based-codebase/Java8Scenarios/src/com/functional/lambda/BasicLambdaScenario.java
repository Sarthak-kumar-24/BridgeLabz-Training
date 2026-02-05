package com.functional.lambda;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/*
 * BasicLambdaScenario
 * ------------------
 * Demonstrates basic system tasks
 * using lambda expressions.
 */
public class BasicLambdaScenario {

	public static void main(String[] args) {

		System.out.println("=================================");
		System.out.println(" Basic System Tasks using Lambda ");
		System.out.println("=================================");

		/*--------------------------------------------------
		 1. Run a task in a separate thread
		--------------------------------------------------*/
		System.out.println("\n1️ Running Task in Separate Thread:");
		Runnable task = () -> System.out.println(" Task running in a separate thread");

		new Thread(task).start();

		/*--------------------------------------------------
		 2. Print numbers from a list
		--------------------------------------------------*/
		System.out.println("\n2️ Printing Numbers from List:");
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

		numbers.forEach(n -> System.out.println(n));

		/*--------------------------------------------------
		 3. Check if a number is even or odd
		--------------------------------------------------*/
		System.out.println("\n3️ Even / Odd Check:");
		int num = 15;

		Predicate<Integer> isEven = n -> n % 2 == 0;

		System.out.println(num + " is " + (isEven.test(num) ? "EVEN " : "ODD "));

		/*--------------------------------------------------
		 4. Add two numbers using lambda
		--------------------------------------------------*/
		System.out.println("\n4️ Addition of Two Numbers:");
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

		System.out.println("Sum = " + add.apply(10, 20));

		/*--------------------------------------------------
		 5. Find greater of two numbers
		--------------------------------------------------*/
		System.out.println("\n5️ Greater of Two Numbers:");
		BiFunction<Integer, Integer, Integer> greater = (a, b) -> (a > b) ? a : b;

		System.out.println("Greater number = " + greater.apply(25, 15));

		System.out.println("\n=================================");
		System.out.println(" Program Completed Successfully ");
		System.out.println("=================================");
	}
}
