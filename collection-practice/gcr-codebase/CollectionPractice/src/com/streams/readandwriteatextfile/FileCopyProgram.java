package com.streams.readandwriteatextfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileCopyProgram
 *
 * This program demonstrates basic file handling in Java.
 * It reads data from a source text file and writes it into
 * a destination file using FileInputStream and FileOutputStream.
 *
 * If the source file does not exist, an appropriate message is displayed.
 */
public class FileCopyProgram {

    public static void main(String[] args) {

        // Source and destination file paths
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Attempt to open source file for reading
            fis = new FileInputStream(sourceFile);

            // Open destination file for writing
            // If file does not exist, it will be created automatically
            fos = new FileOutputStream(destinationFile);

            int byteData;

            // Read one byte at a time from source
            // and write it into destination
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println(" File copied successfully.");

        } catch (IOException e) {
            // Handles file not found and other I/O errors
            System.out.println(" Error: Source file not found or cannot be read.");
            System.out.println("Details: " + e.getMessage());

        } finally {
            // Close resources to prevent memory leaks
            try {
                if (fis != null)
                    fis.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                System.out.println(" Error while closing files.");
            }
        }
    }
}
