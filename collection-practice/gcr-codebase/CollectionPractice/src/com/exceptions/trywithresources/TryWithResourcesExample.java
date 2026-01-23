package com.exceptions.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {

        // Name of the file to be read
        String fileName = "info.txt";

        // try-with-resources automatically closes BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            // Reading the first line of the file
            String firstLine = br.readLine();

            // Printing the first line
            System.out.println(firstLine);

        } catch (IOException e) {
            // Handles file not found and other I/O errors
            System.out.println("Error reading file");
        }
    }

}
