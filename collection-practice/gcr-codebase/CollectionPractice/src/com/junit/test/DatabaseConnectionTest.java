package com.junit.testingBeforeEachandAfterEachannotations;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * DatabaseConnectionTest
 * ----------------------
 * Demonstrates usage of @BeforeEach and @AfterEach.
 */
public class DatabaseConnectionTest {

	private DatabaseConnection db;

	/* ===== RUNS BEFORE EACH TEST ===== */
	@BeforeEach
	void setUp() {
		db = new DatabaseConnection();
		db.connect();
	}

	/* ===== RUNS AFTER EACH TEST ===== */
	@AfterEach
	void tearDown() {
		db.disconnect();
	}

	/* ===== TEST 1 ===== */
	@Test
	void testConnectionIsEstablished() {
		assertTrue(db.isConnected(), "Database should be connected before test");
	}

	/* ===== TEST 2 ===== */
	@Test
	void testConnectionStillActiveDuringTest() {
		assertTrue(db.isConnected(), "Connection must remain active during test");
	}
}
