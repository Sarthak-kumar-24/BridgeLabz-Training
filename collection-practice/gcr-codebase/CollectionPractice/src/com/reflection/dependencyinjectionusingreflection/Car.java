package com.reflection.dependencyinjectionusingreflection;

/*
 * Car
 * ---
 * Depends on Engine.
 */
public class Car {

    @Inject
    private Engine engine;

    public void drive() {
        engine.start();
        System.out.println(" Car is driving");
    }
}

