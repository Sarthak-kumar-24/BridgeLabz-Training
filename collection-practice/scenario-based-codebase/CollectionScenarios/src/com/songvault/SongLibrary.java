package com.songvault;

import java.util.*;
import java.util.stream.*;

/**
 * SongLibrary 
 * ------------ 
 * Stores songs and provides filtering, grouping, and
 * sorting features.
 */
public class SongLibrary {

	private List<Song> songs = new ArrayList<>();

	public void addSong(Song song) {
		if (song != null) {
			songs.add(song);
		}
	}

	/** Group songs by genre */
	public Map<String, List<Song>> groupByGenre() {
		return songs.stream().collect(Collectors.groupingBy(Song::getGenre));
	}

	/** Get unique artists */
	public Set<String> getUniqueArtists() {
		return songs.stream().map(Song::getArtist).collect(Collectors.toSet());
	}

	/** Filter songs by genre */
	public List<Song> filterByGenre(String genre) {
		return songs.stream().filter(s -> s.getGenre().equalsIgnoreCase(genre)).collect(Collectors.toList());
	}

	/** Sort songs alphabetically by title */
	public List<Song> sortByTitle() {
		return songs.stream().sorted(Comparator.comparing(Song::getTitle)).collect(Collectors.toList());
	}
}
