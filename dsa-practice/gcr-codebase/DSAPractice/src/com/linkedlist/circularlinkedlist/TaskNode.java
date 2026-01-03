package com.linkedlist.circularlinkedlist;

/**
 * Represents a single task in the circular linked list.
 */
class TaskNode {

    int taskId;
    String taskName;
    int priority;
    String dueDate;

    TaskNode next;   // Points to next task (circular)

    TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
