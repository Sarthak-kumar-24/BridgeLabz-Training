package com.linkedlist.circularlinkedlist;

/**
 * Task Scheduler implemented using a Circular Linked List.
 */
public class TaskScheduler {

    private TaskNode head;
    private TaskNode current; // Tracks current task for scheduling

    
    /**
     * Adds a task at the beginning of the circular list.
     */
    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = current = newTask;
            newTask.next = newTask;
            return;
        }

        TaskNode tail = head;
        while (tail.next != head) {
            tail = tail.next;
        }

        newTask.next = head;
        tail.next = newTask;
        head = newTask;
    }

    /**
     * Adds a task at the end of the circular list.
     */
    public void addAtEnd(int id, String name, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = current = newTask;
            newTask.next = newTask;
            return;
        }

        TaskNode tail = head;
        while (tail.next != head) {
            tail = tail.next;
        }

        tail.next = newTask;
        newTask.next = head;
    }

    /**
     * Adds a task at a specific position (1-based index).
     */
    public void addAtPosition(int position, int id, String name,
                              int priority, String dueDate) {

        if (position == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode currentNode = head;
        for (int i = 1; i < position - 1 && currentNode.next != head; i++) {
            currentNode = currentNode.next;
        }

        TaskNode newTask = new TaskNode(id, name, priority, dueDate);
        newTask.next = currentNode.next;
        currentNode.next = newTask;
    }

    
    /**
     * Removes a task using Task ID.
     */
    public void removeByTaskId(int taskId) {

        if (head == null) {
            System.out.println(" No tasks available");
            return;
        }

        TaskNode temp = head;
        TaskNode prev = null;

        do {
            if (temp.taskId == taskId) {

                // Single node case
                if (temp == head && temp.next == head) {
                    head = current = null;
                    return;
                }

                // Removing head
                if (temp == head) {
                    TaskNode tail = head;
                    while (tail.next != head) {
                        tail = tail.next;
                    }
                    head = head.next;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }

                if (current == temp) {
                    current = temp.next;
                }

                System.out.println(" Task removed");
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println(" Task not found");
    }



    /**
     * Displays the current task and moves to the next task.
     */
    public void viewAndMoveToNextTask() {
        if (current == null) {
            System.out.println(" No tasks scheduled");
            return;
        }

        System.out.println(
            " Current Task -> ID: " + current.taskId +
            ", Name: " + current.taskName +
            ", Priority: " + current.priority +
            ", Due: " + current.dueDate
        );

        current = current.next;
    }

    
    /**
     * Displays all tasks starting from head.
     */
    public void displayAllTasks() {
        if (head == null) {
            System.out.println(" No tasks available");
            return;
        }

        TaskNode temp = head;
        do {
            System.out.println(
                "ID: " + temp.taskId +
                ", Name: " + temp.taskName +
                ", Priority: " + temp.priority +
                ", Due: " + temp.dueDate
            );
            temp = temp.next;
        } while (temp != head);
    }

    

    /**
     * Searches tasks by priority.
     */
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println(" No tasks available");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                System.out.println(
                    "ID: " + temp.taskId +
                    ", Name: " + temp.taskName +
                    ", Due: " + temp.dueDate
                );
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println(" No tasks found with priority " + priority);
        }
    }

    

    public static void main(String[] args) {

        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addAtEnd(1, "Design Module", 1, "10-Oct");
        scheduler.addAtEnd(2, "Implement Logic", 2, "12-Oct");
        scheduler.addAtBeginning(3, "Requirement Analysis", 1, "08-Oct");
        scheduler.addAtPosition(2, 4, "Testing", 3, "15-Oct");

        System.out.println("\n All Tasks:");
        scheduler.displayAllTasks();

        System.out.println("\n Task Scheduling:");
        scheduler.viewAndMoveToNextTask();
        scheduler.viewAndMoveToNextTask();
        scheduler.viewAndMoveToNextTask();

        System.out.println("\n Search by Priority (1):");
        scheduler.searchByPriority(1);

        scheduler.removeByTaskId(2);

        System.out.println("\n After Removal:");
        scheduler.displayAllTasks();
    }
}
