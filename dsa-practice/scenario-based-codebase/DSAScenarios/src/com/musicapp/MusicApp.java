package com.musicapp;

public class MusicApp {
	public static void main(String[] args) {

		MusicLibraryBST library = new MusicLibraryBST();

		// Insert tracks
		library.insert(102, "Blinding Lights", "The Weeknd");
		library.insert(205, "Shape of You", "Ed Sheeran");
		library.insert(150, "Levitating", "Dua Lipa");
		library.insert(310, "Perfect", "Ed Sheeran");

		// Search a track
		System.out.println(" Searching Track ID 150:");
		TrackNode track = library.search(150);
		if (track != null) {
			System.out.println(track.songTitle + " by " + track.artist);
		} else {
			System.out.println("Track not found!");
		}

		// Display playlist alphabetically
		System.out.println("\n Playlist (Alphabetical Order):");
		library.showPlaylistAlphabetically();
	}

}
