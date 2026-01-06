package com.stringbuilderandbuffer;

/* Compare StringBuffer with StringBuilder for String Concatenation
 * 
 * 
 */
public class StringPerformanceTest {

    private static final int ITERATIONS = 1_000_000;

    public static void main(String[] args) {

        // StringBuilder test
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ITERATIONS; i++) {
            sb.append("hello");
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        // StringBuffer test
        long startBuffer = System.nanoTime();
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < ITERATIONS; i++) {
            buffer.append("hello");
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        // Results
        System.out.println("===== Performance Comparison =====");
        System.out.println("StringBuilder Time : " + builderTime / 1_000_000 + " ms");
        System.out.println("StringBuffer Time  : " + bufferTime / 1_000_000 + " ms");
    }
}

