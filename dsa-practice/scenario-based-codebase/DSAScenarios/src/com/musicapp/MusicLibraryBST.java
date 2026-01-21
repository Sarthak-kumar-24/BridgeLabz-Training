package com.musicapp;

public class MusicLibraryBST {
	private TrackNode root;

	// =========================
	// Scenario 2: Insert New Track
	// =========================
	public void insert(int trackId, String songTitle, String artist) {
		root = insertRec(root, trackId, songTitle, artist);
	}

	private TrackNode insertRec(TrackNode root, int trackId, String songTitle, String artist) {
		// If tree is empty, create new node
		if (root == null) {
			return new TrackNode(trackId, songTitle, artist);
		}

		// BST property based on trackId
		if (trackId < root.trackId) {
			root.left = insertRec(root.left, trackId, songTitle, artist);
		} else if (trackId > root.trackId) {
			root.right = insertRec(root.right, trackId, songTitle, artist);
		}

		return root;
	}

	// =========================
	// Scenario 1: Search Track by ID
	// =========================
	public TrackNode search(int trackId) {
		return searchRec(root, trackId);
	}

	private TrackNode searchRec(TrackNode root, int trackId) {
		// Base case: not found or found
		if (root == null || root.trackId == trackId) {
			return root;
		}

		// Search left or right subtree
		if (trackId < root.trackId) {
			return searchRec(root.left, trackId);
		}

		return searchRec(root.right, trackId);
	}

	// =========================
	// Scenario 3: Show Playlist Alphabetically
	// =========================
	public void showPlaylistAlphabetically() {
		inOrderTraversal(root);
	}

	private void inOrderTraversal(TrackNode root) {
		if (root != null) {
			inOrderTraversal(root.left);
			System.out.println(root.songTitle + " - " + root.artist + " (ID: " + root.trackId + ")");
			inOrderTraversal(root.right);
		}
	}
}
