package com.junit.testingfilehandlingmethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * FileProcessor
 * -------------
 * Handles basic file write and read operations.
 */
public class FileProcessor {

    // Writes content to a file
    public void writeToFile(String filename, String content) throws IOException {
        Path path = Paths.get(filename);
        Files.writeString(path, content);
    }

    // Reads content from a file
    public String readFromFile(String filename) throws IOException {
        Path path = Paths.get(filename);
        return Files.readString(path);
    }
}

