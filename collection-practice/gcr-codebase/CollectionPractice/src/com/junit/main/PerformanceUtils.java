package com.junit.performancetestingusingTimeout;

/*
 * PerformanceUtils
 * ----------------
 * Simulates a long-running task.
 */
public class PerformanceUtils {

    // Simulates a task that takes 3 seconds
    public String longRunningTask() {

        try {
            Thread.sleep(3000); // 3 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return "Task completed";
    }
}
