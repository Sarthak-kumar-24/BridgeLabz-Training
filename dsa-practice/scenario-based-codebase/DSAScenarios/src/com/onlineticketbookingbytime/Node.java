package com.onlineticketbookingbytime;

public class Node {
    int startTime;        // key (event time)
    String eventName;
    Node left, right;

    Node(int startTime, String eventName) {
        this.startTime = startTime;
        this.eventName = eventName;
    }

}
