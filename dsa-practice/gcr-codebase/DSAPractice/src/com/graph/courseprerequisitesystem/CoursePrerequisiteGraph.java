package com.graph.courseprerequisitesystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class CoursePrerequisiteGraph {
	private static Map<String, List<String>> courses = new HashMap<>();

	public static void addCourse(String course) {
		courses.putIfAbsent(course, new ArrayList<>());
	}

	// Add prerequisites (directed)
	public static void addPrerequisite(String course1, String course2) {
		courses.get(course1).add(course2);
	}

	public static void displayCourses(String course) {
		System.out.println("Prequites of  " + course + ": " + courses.get(course));
	}

	public static boolean detectCycle() {
		Set<String> visited = new HashSet<>();
		Set<String> recStack = new HashSet<>();

		for (String course : courses.keySet()) {
			if (dfsCycle(course, visited, recStack)) {
				return true;
			}
		}
		return false;
	}

	private static boolean dfsCycle(String course, Set<String> visited, Set<String> recStack) {
		if (recStack.contains(course))
			return true;
		if (visited.contains(course))
			return false;

		visited.add(course);
		recStack.add(course);

		for (String neighbor : courses.get(course)) {
			if (dfsCycle(neighbor, visited, recStack))
				return true;
		}

		recStack.remove(course);
		return false;
	}

	// -------- Find Prerequisites --------
	public static Set<String> findPrerequisites(String target) {
		Set<String> result = new HashSet<>();

		for (String course : courses.keySet()) {
			dfsFind(course, target, new HashSet<>(), result);
		}
		result.remove(target);
		return result;
	}

	private static boolean dfsFind(String current, String target, Set<String> visited, Set<String> result) {

		if (current.equals(target))
			return true;
		if (visited.contains(current))
			return false;

		visited.add(current);

		for (String next : courses.get(current)) {
			if (dfsFind(next, target, visited, result)) {
				result.add(current);
				return true;
			}
		}
		return false;
	}

	// -------- Topological Sort --------
	static List<String> topologicalSort() {

		Map<String, Integer> inDegree = new HashMap<>();
		for (String course : courses.keySet())
			inDegree.put(course, 0);

		for (String u : courses.keySet()) {
			for (String v : courses.get(u))
				inDegree.put(v, inDegree.get(v) + 1);
		}

		Queue<String> q = new LinkedList<>();
		for (String c : inDegree.keySet()) {
			if (inDegree.get(c) == 0)
				q.add(c);
		}

		List<String> order = new ArrayList<>();

		while (!q.isEmpty()) {
			String curr = q.poll();
			order.add(curr);

			for (String next : courses.get(curr)) {
				inDegree.put(next, inDegree.get(next) - 1);
				if (inDegree.get(next) == 0)
					q.add(next);
			}
		}
		return order;
	}

	public static void main(String[] args) {

		// Courses
		addCourse("CS101");
		addCourse("CS102");
		addCourse("CS201");
		addCourse("CS202");
		addCourse("MATH101");

		// Prerequisites
		addPrerequisite("CS101", "CS102");
		addPrerequisite("CS101", "CS201");
		addPrerequisite("CS102", "CS202");
		addPrerequisite("MATH101", "CS201");

		System.out.println("===== Course Prerequisite Validation =====\n");

		// Task 2
		System.out.println("Cycle Detected? " + (detectCycle() ? "YES" : "NO"));

		// Task 3
		System.out.println("\nCourses required before CS202:");
		System.out.println(findPrerequisites("CS202"));

		// Task 4
		System.out.println("\nValid Course Completion Order:");
		System.out.println(topologicalSort());
	}

}
