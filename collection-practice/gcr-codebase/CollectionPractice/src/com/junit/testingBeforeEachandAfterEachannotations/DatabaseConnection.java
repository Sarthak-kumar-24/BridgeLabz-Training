package com.junit.testingBeforeEachandAfterEachannotations;

/*
 * DatabaseConnection
 * ------------------
 * Simulates a database connection lifecycle.
 */
public class DatabaseConnection {

    private boolean connected = false;

    // Establish connection
    public void connect() {
        connected = true;
        System.out.println(" Database connected");
    }

    // Close connection
    public void disconnect() {
        connected = false;
        System.out.println(" Database disconnected");
    }

    // Check connection status
    public boolean isConnected() {
        return connected;
    }
}

