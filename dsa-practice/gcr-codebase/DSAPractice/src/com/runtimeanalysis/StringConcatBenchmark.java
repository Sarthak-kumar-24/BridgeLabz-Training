package com.runtimeanalysis;

/* String Concatenation Performance
 * 
 * Compare the performance of String (O(N²)), StringBuilder (O(N)), and StringBuffer (O(N)) when concatenating a million strings
 * 
 */
public class StringConcatBenchmark {

    private static final int[] SIZES = {1_000, 10_000, 1_000_000};

    private static void testString(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + "a";
        }
    }

    private static void testStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
    }

    private static void testStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
    }

    public static void main(String[] args) {

        System.out.println("=== String Concatenation Performance Benchmark ===\n");

        for (int n : SIZES) {

            System.out.println("Operations Count : " + n);

            // String
            long startString = System.nanoTime();
            testString(n);
            long endString = System.nanoTime();
            System.out.printf("String        : %.4f ms%n",
                    (endString - startString) / 1_000_000.0);

            // StringBuilder
            long startBuilder = System.nanoTime();
            testStringBuilder(n);
            long endBuilder = System.nanoTime();
            System.out.printf("StringBuilder : %.4f ms%n",
                    (endBuilder - startBuilder) / 1_000_000.0);

            // StringBuffer
            long startBuffer = System.nanoTime();
            testStringBuffer(n);
            long endBuffer = System.nanoTime();
            System.out.printf("StringBuffer  : %.4f ms%n",
                    (endBuffer - startBuffer) / 1_000_000.0);

            System.out.println("-----------------------------------------------");
        }
    }
}

