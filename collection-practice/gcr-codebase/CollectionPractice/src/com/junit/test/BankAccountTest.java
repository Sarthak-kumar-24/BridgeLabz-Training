package com.junit.testingbankingtransactions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * BankAccountTest
 * ----------------
 * JUnit test cases for BankAccount.
 */
public class BankAccountTest {

    private BankAccount account;

    // Fresh account before each test
    @BeforeEach
    void setUp() {
        account = new BankAccount(1000.0);
    }

    /* ===== DEPOSIT TEST ===== */
    @Test
    void testDeposit() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    /* ===== WITHDRAW TEST ===== */
    @Test
    void testWithdraw() {
        account.withdraw(300.0);
        assertEquals(700.0, account.getBalance());
    }

    /* ===== INSUFFICIENT FUNDS TEST ===== */
    @Test
    void testWithdrawInsufficientFunds() {

        IllegalStateException exception = assertThrows(
            IllegalStateException.class,
            () -> account.withdraw(2000.0)
        );

        assertEquals("Insufficient funds", exception.getMessage());
    }

    /* ===== NEGATIVE DEPOSIT TEST ===== */
    @Test
    void testDepositNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-100);
        });
    }

    /* ===== NEGATIVE WITHDRAW TEST ===== */
    @Test
    void testWithdrawNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-50);
        });
    }
}

