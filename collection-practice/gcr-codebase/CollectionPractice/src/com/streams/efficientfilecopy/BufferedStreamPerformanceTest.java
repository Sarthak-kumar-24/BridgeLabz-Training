package com.streams.efficientfilecopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * BufferedStreamPerformanceTest
 *
 * This program compares the performance of:
 * 1. Unbuffered file copy (FileInputStream + FileOutputStream)
 * 2. Buffered file copy (BufferedInputStream + BufferedOutputStream)
 *
 * The file is read and written in chunks of 4 KB (4096 bytes).
 * Execution time is measured using System.nanoTime().
 */
public class BufferedStreamPerformanceTest {
	
    // Buffer size = 4 KB
    private static final int BUFFER_SIZE = 4096;

    /**
     * Copies file using UNBUFFERED streams
     */
    public static long copyUsingUnbuffered(String src, String dest) {

        long startTime = System.nanoTime();

        try (
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dest)
        ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            // Read and write in chunks
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println(" Error in unbuffered copy: " + e.getMessage());
        }

        return System.nanoTime() - startTime;
    }

    /**
     * Copies file using BUFFERED streams
     */
    public static long copyUsingBuffered(String src, String dest) {

        long startTime = System.nanoTime();

        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))
        ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            // Read and write in chunks
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println(" Error in buffered copy: " + e.getMessage());
        }

        return System.nanoTime() - startTime;
    }

    /**
     * Main method – Program entry point
     */
    public static void main(String[] args) {

        // Source file (large file recommended, e.g., 100MB)
        String sourceFile = "largeFile.txt";

        // Destination files
        String unbufferedDest = "copy_unbuffered.txt";
        String bufferedDest = "copy_buffered.txt";

        System.out.println("===== Buffered vs Unbuffered Stream Test =====\n");

        // Unbuffered copy
        long unbufferedTime = copyUsingUnbuffered(sourceFile, unbufferedDest);
        System.out.println("Unbuffered copy time: " +
                (unbufferedTime / 1_000_000) + " ms");

        // Buffered copy
        long bufferedTime = copyUsingBuffered(sourceFile, bufferedDest);
        System.out.println("Buffered copy time: " +
                (bufferedTime / 1_000_000) + " ms");

        // Performance comparison
        System.out.println("\n===== Performance Result =====");
        if (bufferedTime < unbufferedTime) {
            System.out.println(" Buffered streams are faster.");
        } else {
            System.out.println(" No significant improvement observed.");
        }
    }

}
