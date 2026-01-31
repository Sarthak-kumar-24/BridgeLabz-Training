package com.collectors.librarybookstatistics;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		// Sample book list
		List<Book> books = Arrays.asList(new Book("BookA", "SciFi", 300), new Book("BookB", "SciFi", 500),
				new Book("BookC", "History", 250), new Book("BookD", "History", 400),
				new Book("BookE", "Fantasy", 600));

		//  Core Logic:
		// Group by genre -> compute page statistics
		Map<String, IntSummaryStatistics> statsByGenre = books.stream()

				// groupingBy -> Map<Genre, statistics>
				.collect(Collectors.groupingBy(

						// key mapper -> genre
						Book::getGenre,

						// downstream collector -> summarize int field
						Collectors.summarizingInt(Book::getPages)));

		// Print full statistics per genre
		statsByGenre.forEach((genre, stats) -> {
			System.out.println("Genre: " + genre);
			System.out.println("Total pages: " + stats.getSum());
			System.out.println("Average pages: " + stats.getAverage());
			System.out.println("Max pages: " + stats.getMax());
			System.out.println("Min pages: " + stats.getMin());
			System.out.println("Count: " + stats.getCount());
			System.out.println("------");
		});
	}

}
