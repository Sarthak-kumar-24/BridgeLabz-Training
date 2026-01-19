package com.graph.socialnetworkconnection;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

/**
 * Social Network Graph Implementation
 *
 * Demonstrates: - Adjacency List representation - Finding direct friends -
 * Checking direct connection - BFS for shortest path (degree of separation)
 */
public class SocialNetworkGraph {
	// Graph using adjacency list
	private static Map<String, List<String>> graph = new HashMap<>();

	// Add user
	public static void addUser(String user) {
		graph.putIfAbsent(user, new ArrayList<>());
	}

	// Add friendship (undirected)
	public static void addFriendship(String u, String v) {
		graph.get(u).add(v);
		graph.get(v).add(u);
	}

	// Display all friends of a user
	public static void displayFriends(String user) {
		System.out.println("Friends of " + user + ": " + graph.get(user));
	}

	// Check direct connection
	public static boolean isDirectFriend(String u, String v) {
		return graph.get(u).contains(v);
	}

	// BFS to find shortest path
	public static int shortestPath(String start, String end) {

		Queue<String> queue = new LinkedList<>();
		Set<String> visited = new HashSet<>();
		Map<String, Integer> distance = new HashMap<>();

		queue.add(start);
		visited.add(start);
		distance.put(start, 0);

		while (!queue.isEmpty()) {
			String current = queue.poll();

			if (current.equals(end))
				return distance.get(current);

			for (String neighbor : graph.get(current)) {
				if (!visited.contains(neighbor)) {
					visited.add(neighbor);
					queue.add(neighbor);
					distance.put(neighbor, distance.get(current) + 1);
				}
			}
		}
		return -1; // Not connected
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Users
		String[] users = { "Alice", "Bob", "Charlie", "David", "Eve" };
		for (String user : users)
			addUser(user);
		

		// Friendships
		addFriendship("Alice", "Bob");
		addFriendship("Alice", "Charlie");
		addFriendship("Bob", "David");
		addFriendship("Charlie", "Eve");
		addFriendship("David", "Eve");

		System.out.println("===== Social Network Analysis =====\n");

		// Task 2
		displayFriends("Alice");

		// Task 3
		System.out.println("\nAre Bob and Eve directly connected? " + (isDirectFriend("Bob", "Eve") ? "Yes" : "No"));

		// Task 4
		int degree = shortestPath("Alice", "Eve");
		System.out.println("\nDegree of separation between Alice and Eve: " + degree);

		sc.close();
	}

}

