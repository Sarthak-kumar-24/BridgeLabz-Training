package com.linkedlist.circularlinkedlist;


/**
 * Represents a single process in Round Robin scheduling.
 */
public class ProcessNode {
	
    int processId;
    int burstTime;          // Remaining burst time
    int priority;

    int waitingTime = 0;
    int turnaroundTime = 0;

    ProcessNode next;       // Circular link

    ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }

}
