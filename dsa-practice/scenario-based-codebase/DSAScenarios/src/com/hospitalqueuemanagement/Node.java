package com.hospitalqueuemanagement;



public class Node {

    int time;            // check-in time (HHMM)
    String name;
    int height;
    Node left, right;

    Node(int time, String name) {
        this.time = time;
        this.name = name;
        height = 1;
    }
}
