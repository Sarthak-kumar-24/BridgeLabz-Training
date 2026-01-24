package com.examresultuploader;

/**
 * InvalidResultFormatException
 * -----------------------------
 * Thrown when a CSV line does not match
 * the required result format.
 */
public class InvalidResultFormatException extends Exception {

    public InvalidResultFormatException(String message) {
        super(message);
    }
}
