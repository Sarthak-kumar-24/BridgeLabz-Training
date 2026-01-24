package com.chatlogparser;

import java.util.*;
import java.io.*;

/**
 * ChatLogParserApp 
 * ----------------- 
 * Main driver class for ChatLogParser
 * system. Reads logs, filters idle chat, and displays user-wise chat activity.
 */
public class ChatLogParserApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter chat log file path: ");
		String filePath = sc.nextLine();

		try {
			// Step 1: Read logs
			List<ChatMessage> messages = ChatLogReader.readLogs(filePath);

			// Step 2: Apply idle chat filter
			MessageFilter<ChatMessage> filter = new IdleChatFilter();

			Map<String, List<String>> result = ChatAnalyzer.analyze(messages, filter);

			// Step 3: Display output
			System.out.println("\n===== CHAT ACTIVITY REPORT =====\n");

			for (Map.Entry<String, List<String>> entry : result.entrySet()) {

				System.out.println("User: " + entry.getKey());
				for (String msg : entry.getValue()) {
					System.out.println(" - " + msg);
				}
				System.out.println();
			}

		} catch (IOException e) {
			System.out.println("File error: " + e.getMessage());
		}
	}
}
