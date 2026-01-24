package com.songvault;

/**
 * Song 
 * ----- 
 * Represents a song entity parsed from a text file.
 */
public class Song implements Media {

	private String title;
	private String artist;
	private String duration;
	private String genre;

	public Song(String title, String artist, String duration, String genre) {
		this.title = title;
		this.artist = artist;
		this.duration = duration;
		this.genre = genre;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getArtist() {
		return artist;
	}

	public String getGenre() {
		return genre;
	}

	public String getDuration() {
		return duration;
	}

	@Override
	public String toString() {
		return title + " | " + artist + " | " + duration + " | " + genre;
	}
}
