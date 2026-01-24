package com.chatlogparser;

import java.util.*;

/**
 * IdleChatFilter
 * ----------------
 * Filters out idle / non-productive messages
 * based on predefined keywords.
 */
public class IdleChatFilter implements MessageFilter<ChatMessage> {

    private static final Set<String> IDLE_KEYWORDS =
            Set.of("lol", "brb", "haha", "ttyl");

    @Override
    public boolean allow(ChatMessage message) {

        String text = message.getMessage().toLowerCase();

        for (String keyword : IDLE_KEYWORDS) {
            if (text.contains(keyword)) {
                return false; // reject idle chat
            }
        }
        return true;
    }
}
