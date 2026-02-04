package com.functional.custom;

/*
 * TaxCalculator
 * -------------
 * Custom functional interface to calculate tax.
 */
@FunctionalInterface
public interface TaxCalculator {
    double tax(double salary);
}
