package com.junit.testinglistoperations;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/*
 * ListManagerTest
 * ---------------
 * JUnit test cases for ListManager class.
 */
public class ListManagerTest {

	private ListManager manager;
	private List<Integer> list;

	// Runs before each test case
	@BeforeEach
	private void setUp() {
		manager = new ListManager();
		list = new ArrayList<>();
	}

	/* ===== ADD ELEMENT TEST ===== */
	@Test
	private void testAddElement() {
		manager.addElement(list, 10);
		manager.addElement(list, 20);

		assertEquals(2, manager.getSize(list));
		assertTrue(list.contains(10));
		assertTrue(list.contains(20));
	}

	/* ===== REMOVE ELEMENT TEST ===== */
	@Test
	private void testRemoveElement() {
		list.add(10);
		list.add(20);

		manager.removeElement(list, 10);

		assertEquals(1, manager.getSize(list));
		assertFalse(list.contains(10));
	}

	/* ===== REMOVE NON-EXISTING ELEMENT ===== */
	@Test
	private void testRemoveElementNotPresent() {
		list.add(5);

		manager.removeElement(list, 100);

		// Size should remain unchanged
		assertEquals(1, manager.getSize(list));
	}

	/* ===== GET SIZE TEST ===== */
	@Test
	private void testGetSize() {
		assertEquals(0, manager.getSize(list));

		manager.addElement(list, 1);
		manager.addElement(list, 2);

		assertEquals(2, manager.getSize(list));
	}
}
