package com.musicapp;

//Node class representing a song in the music app
public class TrackNode {
	
    int trackId;
    String songTitle;
    String artist;

    TrackNode left, right;

    // Constructor
    TrackNode(int trackId, String songTitle, String artist) {
        this.trackId = trackId;
        this.songTitle = songTitle;
        this.artist = artist;
        left = right = null;
    }

}
