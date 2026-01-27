package com.junit.testingstringutilitymethods;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * StringUtilsTest
 * ---------------
 * JUnit test cases for StringUtils class.
 */
public class StringUtilsTest {

    StringUtils utils = new StringUtils();

    /* ===== REVERSE TESTS ===== */
    @Test
    void testReverseNormalString() {
        assertEquals("olleh", utils.reverse("hello"));
    }

    @Test
    void testReverseEmptyString() {
        assertEquals("", utils.reverse(""));
    }

    @Test
    void testReverseNull() {
        assertNull(utils.reverse(null));
    }

    /* ===== PALINDROME TESTS ===== */
    @Test
    void testPalindromeTrue() {
        assertTrue(utils.isPalindrome("madam"));
    }

    @Test
    void testPalindromeFalse() {
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test
    void testPalindromeNull() {
        assertFalse(utils.isPalindrome(null));
    }

    /* ===== UPPERCASE TESTS ===== */
    @Test
    void testToUpperCase() {
        assertEquals("JAVA", utils.toUpperCase("java"));
    }

    @Test
    void testToUpperCaseWithMixedCase() {
        assertEquals("HeLLo".toUpperCase(), utils.toUpperCase("HeLLo"));
    }

    @Test
    void testToUpperCaseNull() {
        assertNull(utils.toUpperCase(null));
    }
}
