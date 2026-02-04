package com.functional.custom;

/*
 * BonusCalculator
 * ---------------
 * Custom functional interface to calculate bonus.
 */
@FunctionalInterface
public interface BonusCalculator {
	double calculate(double salary);
}
