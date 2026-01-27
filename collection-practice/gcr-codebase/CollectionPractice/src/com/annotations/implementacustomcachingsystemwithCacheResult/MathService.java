package com.annotations.implementacustomcachingsystemwithCacheResult;

public class MathService {

    // Simulating an expensive computation
    @CacheResult
    public int expensiveSquare(int n) {

        System.out.println("Computing square for " + n);

        // Simulate heavy work
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return n * n;
    }
}

