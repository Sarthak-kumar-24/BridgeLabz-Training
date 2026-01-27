package com.reflection.accessandmodifystaticfields;

/*
 * Configuration
 * -------------
 * Holds application configuration values.
 */
public class Configuration {

    private static String API_KEY = "DEFAULT_KEY";

    // Just for verification (optional)
    public static String getApiKey() {
        return API_KEY;
    }
}
