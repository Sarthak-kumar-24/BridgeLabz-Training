package com.functional.custom;

/*
 * LoanEligibilityChecker
 * ----------------------
 * Custom functional interface to check loan eligibility.
 */
@FunctionalInterface
public interface LoanEligibilityChecker {
    boolean check(double balance);
}