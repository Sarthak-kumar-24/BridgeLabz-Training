package com.junit.performancetestingusingTimeout;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

/*
 * PerformanceUtilsTest
 * --------------------
 * Demonstrates performance testing using @Timeout.
 */
public class PerformanceUtilsTest {

    PerformanceUtils utils = new PerformanceUtils();

    /* ===== PERFORMANCE TEST ===== */
    @Test
    @Timeout(2) // fails if execution takes more than 2 seconds
    void testLongRunningTaskPerformance() {

        String result = utils.longRunningTask();
        assertEquals("Task completed", result);
    }
}

