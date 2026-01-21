package com.streams.interthreadcommunication;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * PipedStreamDemo
 *
 * This program demonstrates inter-thread communication
 * using PipedInputStream and PipedOutputStream.
 *
 * One thread writes data into the pipe,
 * another thread reads data from the pipe.
 */
public class PipedStreamDemo {
	
    static class WriterThread extends Thread {

        private PipedOutputStream outputStream;

        // Constructor receives the connected output stream
        public WriterThread(PipedOutputStream outputStream) {
            this.outputStream = outputStream;
        }

        @Override
        public void run() {
            try {
                String message = "Hello from Writer Thread!";

                // Convert string to bytes and write to pipe
                outputStream.write(message.getBytes());

                // Closing output stream signals end of data
                outputStream.close();

            } catch (IOException e) {
                System.out.println(" Error in WriterThread: " + e.getMessage());
            }
        }
    }

    /**
     * ReaderThread
     *
     * This thread reads data from PipedInputStream.
     */
    static class ReaderThread extends Thread {

        private PipedInputStream inputStream;

        // Constructor receives the connected input stream
        public ReaderThread(PipedInputStream inputStream) {
            this.inputStream = inputStream;
        }

        @Override
        public void run() {
            try {
                int data;

                // Read data byte-by-byte from pipe
                while ((data = inputStream.read()) != -1) {
                    System.out.print((char) data);
                }

                // Close input stream
                inputStream.close();

            } catch (IOException e) {
                System.out.println(" Error in ReaderThread: " + e.getMessage());
            }
        }
    }

    /**
     * Main method – program entry point
     */
    public static void main(String[] args) {

        try {
            // Create piped streams
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos); // connect streams

            // Create threads
            WriterThread writer = new WriterThread(pos);
            ReaderThread reader = new ReaderThread(pis);

            System.out.println("===== Piped Stream Inter-Thread Communication =====\n");

            // Start reader first (good practice)
            reader.start();
            writer.start();

        } catch (IOException e) {
            System.out.println(" Error connecting piped streams: " + e.getMessage());
        }
    }

}
