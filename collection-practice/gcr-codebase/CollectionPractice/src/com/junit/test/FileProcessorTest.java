package com.junit.testingfilehandlingmethods;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/*
 * FileProcessorTest
 * -----------------
 * JUnit tests for FileProcessor class.
 */
public class FileProcessorTest {

    private final FileProcessor processor = new FileProcessor();
    private final String testFile = "test-file.txt";

    /* ===== CLEANUP AFTER EACH TEST ===== */
    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Path.of(testFile));
    }

    /* ===== WRITE & READ CONTENT TEST ===== */
    @Test
    void testWriteAndReadFile() throws IOException {

        String content = "Hello JUnit File Testing!";

        processor.writeToFile(testFile, content);
        String result = processor.readFromFile(testFile);

        assertEquals(content, result);
    }

    /* ===== FILE EXISTS AFTER WRITING ===== */
    @Test
    void testFileExistsAfterWrite() throws IOException {

        processor.writeToFile(testFile, "Checking file existence");

        assertTrue(Files.exists(Path.of(testFile)));
    }

    /* ===== FILE NOT FOUND EXCEPTION ===== */
    @Test
    void testReadFromNonExistingFile() {

        assertThrows(IOException.class, () -> {
            processor.readFromFile("non-existing-file.txt");
        });
    }
}

