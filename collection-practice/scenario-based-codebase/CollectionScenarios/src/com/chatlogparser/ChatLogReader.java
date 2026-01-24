package com.chatlogparser;

import java.io.*;
import java.util.*;
import java.util.regex.*;

/**
 * ChatLogReader
 * --------------
 * Reads chat log files and parses each line
 * using Regular Expressions.
 */
public class ChatLogReader {

    // Regex to parse [time] user: message
    private static final Pattern LOG_PATTERN =
            Pattern.compile("\\[(.*?)\\]\\s+(.*?):\\s+(.*)");

    public static List<ChatMessage> readLogs(String filePath)
            throws IOException {

        List<ChatMessage> messages = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line;
        while ((line = br.readLine()) != null) {

            Matcher matcher = LOG_PATTERN.matcher(line);

            if (matcher.matches()) {
                String time = matcher.group(1);
                String user = matcher.group(2);
                String msg = matcher.group(3);

                messages.add(new ChatMessage(time, user, msg));
            }
        }

        br.close();
        return messages;
    }
}
