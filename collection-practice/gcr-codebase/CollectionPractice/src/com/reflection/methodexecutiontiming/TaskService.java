package com.reflection.methodexecutiontiming;

/*
 * TaskService
 * -----------
 * Sample class with methods whose execution time
 * will be measured dynamically.
 */
public class TaskService {

    public void fastTask() {
        for (int i = 0; i < 1_000_000; i++) {
            // simulate small work
        }
    }

    public void slowTask() {
        try {
            Thread.sleep(500); // simulate delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

