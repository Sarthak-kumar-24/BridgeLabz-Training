package com.streamAPI.top5trendingmovies;

import java.util.*;
import java.util.stream.Collectors;

/*
 * TrendingMoviesApp
 * -----------------
 * Finds top 5 trending movies
 * using Java Stream API.
 */
public class TrendingMoviesApp {

	public static void main(String[] args) {

		List<Movie> movies = Arrays.asList(new Movie("Movie A", 8.9, 2024), 
				new Movie("Movie B", 9.1, 2023),
				new Movie("Movie C", 8.5, 2022), 
				new Movie("Movie D", 9.0, 2024), 
				new Movie("Movie E", 8.7, 2021),
				new Movie("Movie F", 9.2, 2024), 
				new Movie("Movie G", 8.8, 2023), 
				new Movie("Movie H", 9.3, 2022));

		// Stream processing
		List<Movie> top5TrendingMovies = movies.stream()

				// Step 1: Filter movies with rating >= 8.5
				.filter(movie -> movie.getRating() >= 8.5)

				// Step 2: Sort by rating (desc), then by release year (desc)
				.sorted(Comparator.comparing(Movie::getRating).reversed().thenComparing(Movie::getReleaseYear)
						.reversed())

				// Step 3: Limit to top 5
				.limit(5)

				// Collect result
				.collect(Collectors.toList());

		// Display result
		System.out.println(" Top 5 Trending Movies:");
		top5TrendingMovies.forEach(System.out::println);
	}
}
