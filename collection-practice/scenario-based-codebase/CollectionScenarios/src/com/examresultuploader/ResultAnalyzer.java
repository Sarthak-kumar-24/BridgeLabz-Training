package com.examresultuploader;

import java.util.*;

/**
 * ResultAnalyzer 
 * ---------------- 
 * Stores subject-wise marks and calculates top
 * scorers using PriorityQueue.
 */
public class ResultAnalyzer {

	public static void analyze(List<ExamRecord<String>> records) {

		Map<String, List<Integer>> subjectMarks = new HashMap<>();

		// Store subject-wise marks
		for (ExamRecord<String> record : records) {
			subjectMarks.computeIfAbsent(record.getSubject(), k -> new ArrayList<>()).add(record.getMarks());
		}

		System.out.println("\n===== TOP SCORERS =====\n");

		// Find top scorer per subject
		for (Map.Entry<String, List<Integer>> entry : subjectMarks.entrySet()) {

			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

			pq.addAll(entry.getValue());

			System.out.println(entry.getKey() + " -> Top Marks: " + pq.peek());
		}
	}
}
