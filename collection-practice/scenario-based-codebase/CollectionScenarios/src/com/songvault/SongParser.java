package com.songvault;

import java.util.regex.*;

/**
 * SongParser 
 * ----------- 
 * Uses Regular Expressions to extract song metadata from
 * text.
 */
public class SongParser {

	private static final Pattern TITLE = Pattern.compile("Title:\\s*(.*)");
	private static final Pattern ARTIST = Pattern.compile("Artist:\\s*(.*)");
	private static final Pattern DURATION = Pattern.compile("Duration:\\s*(.*)");
	private static final Pattern GENRE = Pattern.compile("Genre:\\s*(.*)");

	public static Song parse(String block) {

		Matcher t = TITLE.matcher(block);
		Matcher a = ARTIST.matcher(block);
		Matcher d = DURATION.matcher(block);
		Matcher g = GENRE.matcher(block);

		if (t.find() && a.find() && d.find() && g.find()) {
			return new Song(t.group(1), a.group(1), d.group(1), g.group(1));
		}
		return null;
	}
}
