package com.streamAPI.top5trendingmovies;

/*
 * Movie
 * -----
 * Represents a movie with
 * title, rating, and release year.
 */
public class Movie {

	private String title;
	private double rating;
	private int releaseYear;

	public Movie(String title, double rating, int releaseYear) {
		this.title = title;
		this.rating = rating;
		this.releaseYear = releaseYear;
	}

	public String getTitle() {
		return title;
	}

	public double getRating() {
		return rating;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	@Override
	public String toString() {
		return title + " | Rating: " + rating + " | Year: " + releaseYear;
	}
}
