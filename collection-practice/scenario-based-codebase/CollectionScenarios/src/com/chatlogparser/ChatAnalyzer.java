package com.chatlogparser;

import java.util.*;

/**
 * ChatAnalyzer 
 * ------------- 
 * Stores chat messages user-wise and applies
 * filtering rules using generic interfaces.
 */
public class ChatAnalyzer {

	public static Map<String, List<String>> analyze(List<ChatMessage> messages, MessageFilter<ChatMessage> filter) {

		// TreeMap -> users sorted alphabetically
		Map<String, List<String>> userMessages = new TreeMap<>();

		for (ChatMessage msg : messages) {

			if (!filter.allow(msg)) {
				continue; // skip idle messages
			}

			userMessages.computeIfAbsent(msg.getUser(), k -> new ArrayList<>()).add(msg.toString());
		}

		return userMessages;
	}
}
