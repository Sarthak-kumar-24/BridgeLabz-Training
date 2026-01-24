package com.chatlogparser;

/**
 * MessageFilter<T>
 * -----------------
 * Generic interface to define filtering rules
 * for chat messages.
 */
public interface MessageFilter<T> {

    boolean allow(T message);
}

