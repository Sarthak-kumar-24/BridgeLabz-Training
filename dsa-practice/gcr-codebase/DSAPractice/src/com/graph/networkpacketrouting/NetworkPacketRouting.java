package com.graph;

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
 * Network Packet Routing System
 *
 * Demonstrates:
 * - Adjacency List representation
 * - Connectivity check using BFS
 * - Handling link failure
 * - BFS shortest path (minimum hops)
 */
public class NetworkPacketRouting {
	
    private static Map<String, List<String>> graph = new HashMap<>();

    // Add router
    private static void addRouter(String router) {
        graph.putIfAbsent(router, new ArrayList<>());
    }

    // Add undirected connection
    private static void addConnection(String a, String b) {
        graph.get(a).add(b);
        graph.get(b).add(a);
    }

    // BFS to check connectivity
    private static boolean isConnected(String start) {
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            String curr = q.poll();
            for (String neighbor : graph.get(curr)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    q.add(neighbor);
                }
            }
        }
        return visited.size() == graph.size();
    }

    // BFS shortest path (minimum hops)
    private static List<String> shortestPath(String start, String end) {

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

            for (String next : graph.get(curr)) {
                if (!visited.contains(next)) {
                    visited.add(next);
                    parent.put(next, curr);
                    q.add(next);
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

        // Routers
        String[] routers = {"R1", "R2", "R3", "R4", "R5", "R6"};
        for (String r : routers) addRouter(r);

        // Connections
        addConnection("R1", "R2");
        addConnection("R1", "R3");
        addConnection("R2", "R4");
        addConnection("R3", "R4");
        addConnection("R4", "R5");
        addConnection("R5", "R6");

        System.out.println("===== Network Packet Routing =====\n");

        // Task 3
        System.out.println("Is network connected? " +
                (isConnected("R1") ? "YES" : "NO"));

        // Task 5
        List<String> path = shortestPath("R1", "R6");
        System.out.println("\nShortest path from R1 to R6:");
        System.out.println(path);
        System.out.println("Minimum hops = " + (path.size() - 1));
    }

}
