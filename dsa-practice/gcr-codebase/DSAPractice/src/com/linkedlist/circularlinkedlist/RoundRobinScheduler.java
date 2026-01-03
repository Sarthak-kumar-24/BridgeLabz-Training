package com.linkedlist.circularlinkedlist;

/**
 * Implements Round Robin CPU Scheduling using a Circular Linked List.
 */
public class RoundRobinScheduler {

    private ProcessNode head;
    private ProcessNode current;

    private final int TIME_QUANTUM;
    private int totalProcesses = 0;
    private int currentTime = 0;

    public RoundRobinScheduler(int timeQuantum) {
        this.TIME_QUANTUM = timeQuantum;
    }

    
    /**
     * Adds a process at the end of the circular list.
     */
    public void addProcess(int pid, int burstTime, int priority) {

        ProcessNode newProcess = new ProcessNode(pid, burstTime, priority);

        if (head == null) {
            head = current = newProcess;
            newProcess.next = newProcess;
        } else {
            ProcessNode tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            tail.next = newProcess;
            newProcess.next = head;
        }

        totalProcesses++;
    }

    
    /**
     * Removes a completed process from the circular list.
     */
    private void removeProcess(ProcessNode process) {

        if (head == null) return;

        // Single process case
        if (process == head && process.next == head) {
            head = current = null;
            return;
        }

        ProcessNode prev = head;
        while (prev.next != process) {
            prev = prev.next;
        }

        prev.next = process.next;

        if (process == head) {
            head = process.next;
        }
        if (process == current) {
            current = process.next;
        }
    }

    
    /**
     * Simulates Round Robin scheduling.
     */
    public void simulateScheduling() {

        if (head == null) {
            System.out.println(" No processes to schedule");
            return;
        }

        int completed = 0;

        while (completed < totalProcesses) {

            ProcessNode executing = current;

            int executionTime = Math.min(TIME_QUANTUM, executing.burstTime);
            executing.burstTime -= executionTime;
            currentTime += executionTime;

            System.out.println(
                " Executing Process " + executing.processId +
                " for " + executionTime + " units"
            );

            // Update waiting time for others
            ProcessNode temp = head;
            do {
                if (temp != executing && temp.burstTime > 0) {
                    temp.waitingTime += executionTime;
                }
                temp = temp.next;
            } while (temp != head);

            // If process completes
            if (executing.burstTime == 0) {
                executing.turnaroundTime = currentTime;
                System.out.println(" Process " + executing.processId + " completed");
                removeProcess(executing);
                completed++;
            } else {
                current = current.next;
            }

            displayQueue();
            System.out.println("--------------------------------");
        }

        calculateAverages();
    }

    

    /**
     * Displays current circular queue.
     */
    private void displayQueue() {
        if (head == null) {
            System.out.println("Queue empty");
            return;
        }

        System.out.print(" Queue: ");
        ProcessNode temp = head;
        do {
            System.out.print(
                "[P" + temp.processId + ", BT:" + temp.burstTime + "] "
            );
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    

    /**
     * Calculates and displays average waiting and turnaround time.
     */
    private void calculateAverages() {

        double totalWaiting = 0;
        double totalTurnaround = 0;

        

        System.out.println(" Scheduling completed.");
        System.out.println("Average Waiting Time: " + (totalWaiting / totalProcesses));
        System.out.println("Average Turnaround Time: " + (totalTurnaround / totalProcesses));
    }

    
    public static void main(String[] args) {

        RoundRobinScheduler scheduler = new RoundRobinScheduler(3);

        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        scheduler.simulateScheduling();
    }
}

