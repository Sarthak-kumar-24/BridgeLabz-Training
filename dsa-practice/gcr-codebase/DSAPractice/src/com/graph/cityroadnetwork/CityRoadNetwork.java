package com.graph.cityroadnetwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * City Road Network
 *
 * Demonstrates: - Directed weighted graph - BFS reachability - BFS shortest
 * path (fewest turns) - DFS limitation explanation
 */
public class CityRoadNetwork {

	// Graph: node -> list of (neighbor, distance)
	static class Edge {
		String to;
		int distance;

		Edge(String to, int distance) {
			this.to = to;
			this.distance = distance;
		}
	}

	private static Map<String, List<Edge>> graph = new HashMap<>();

	// Add intersection
	public static void addNode(String node) {
		graph.putIfAbsent(node, new ArrayList<>());
	}

	// Add road (directed)
	public static void addEdge(String from, String to, int distance) {
		graph.get(from).add(new Edge(to, distance));
	}

	
	// BFS: reachable intersections
	public static Set<String> bfsReachable(String start) {
		Set<String> visited = new HashSet<>();
		Queue<String> q = new LinkedList<>();

		q.add(start);
		visited.add(start);

		while (!q.isEmpty()) {
			String curr = q.poll();

			for (Edge e : graph.get(curr)) {
				if (!visited.contains(e.to)) {
					visited.add(e.to);
					q.add(e.to);
				}
			}
		}
		return visited;
	}

	// BFS: shortest path (fewest edges)
	public static List<String> bfsShortestPath(String start, String end) {

		Queue<String> q = new LinkedList<>();
		Map<String, String> parent = new HashMap<>();
		Set<String> visited = new HashSet<>();

		q.add(start);
		visited.add(start);
		parent.put(start, null);

		while (!q.isEmpty()) {
			String curr = q.poll();

			if (curr.equals(end))
				break;

			for (Edge e : graph.get(curr)) {
				if (!visited.contains(e.to)) {
					visited.add(e.to);
					parent.put(e.to, curr);
					q.add(e.to);
				}
			}
		}

		// Reconstruct path
		List<String> path = new ArrayList<>();
		String step = end;

		while (step != null) {
			path.add(step);
			step = parent.get(step);
		}

		Collections.reverse(path);
		return path;
	}

	public static void main(String[] args) {

		// Intersections
		addNode("A");
		addNode("B");
		addNode("C");
		addNode("D");
		addNode("E");

		// Roads
		addEdge("A", "B", 5);
		addEdge("B", "C", 3);
		addEdge("C", "B", 3);
		addEdge("A", "D", 7);
		addEdge("D", "A", 7);
		addEdge("D", "E", 2);
		addEdge("C", "E", 4);

		System.out.println("===== City Road Network =====\n");

		// Task 2
		System.out.println("Intersections reachable from A:");
		System.out.println(bfsReachable("A"));

		// Task 3
		System.out.println("\nPath with fewest turns from A to E:");
		System.out.println(bfsShortestPath("A", "E"));

		// Task 4
		System.out.println("\nWhy DFS is not optimal for shortest distance:");
		System.out.println("DFS explores deep paths first and may miss shorter routes.");
	}

}
