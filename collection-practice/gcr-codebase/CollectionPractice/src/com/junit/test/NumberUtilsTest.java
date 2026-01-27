package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.junit.main.NumberUtils;

/*
 * NumberUtilsTest
 * ----------------
 * Demonstrates parameterized testing using @ValueSource.
 */
public class NumberUtilsTest {

    NumberUtils utils = new NumberUtils();

    /* ===== EVEN NUMBERS TEST ===== */
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void testIsEvenTrue(int number) {
        assertTrue(utils.isEven(number));
    }

    /* ===== ODD NUMBERS TEST ===== */
    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void testIsEvenFalse(int number) {
        assertFalse(utils.isEven(number));
    }
}

