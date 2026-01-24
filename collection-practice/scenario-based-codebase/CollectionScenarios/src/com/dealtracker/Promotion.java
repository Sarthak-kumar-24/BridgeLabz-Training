package com.dealtracker;

/**
 * Promotion<T>
 * -------------
 * Generic base interface for all types
 * of promotions like discounts, cashback,
 * referral bonuses, etc.
 */
public interface Promotion<T> {

    String getCode();
    T getBenefit();
}

