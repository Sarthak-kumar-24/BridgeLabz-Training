package com.runtimeanalysis;

import java.io.*;

/*
 * Large File Reading Efficiency
 * 
 * Compare FileReader (Character Stream) and InputStreamReader (Byte Stream) when reading a large file (500MB).
 */
public class FileReadBenchmark {

    private static void readWithFileReader(File file) throws IOException {
        try (FileReader reader = new FileReader(file)) {
            char[] buffer = new char[8192];
            while (reader.read(buffer) != -1) {
                // reading only
            }
        }
    }

    private static void readWithInputStreamReader(File file) throws IOException {
        try (InputStreamReader reader =
                     new InputStreamReader(new FileInputStream(file))) {
            char[] buffer = new char[8192];
            while (reader.read(buffer) != -1) {
                // reading only
            }
        }
    }

    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            System.out.println("Usage: java FileReadBenchmark ");
            return;
        }

        File file = new File(args[0]);
        System.out.println("File Size : " + (file.length() / (1024 * 1024)) + " MB\n");

        // FileReader
        long startFR = System.nanoTime();
        readWithFileReader(file);
        long endFR = System.nanoTime();

        // InputStreamReader
        long startISR = System.nanoTime();
        readWithInputStreamReader(file);
        long endISR = System.nanoTime();

        System.out.printf("FileReader Time        : %.4f ms%n",
                (endFR - startFR) / 1_000_000.0);
        System.out.printf("InputStreamReader Time: %.4f ms%n",
                (endISR - startISR) / 1_000_000.0);
    }
}

