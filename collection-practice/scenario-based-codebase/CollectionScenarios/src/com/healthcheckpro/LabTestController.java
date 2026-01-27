package com.healthcheckpro;

/**
 * Controller class representing lab test APIs in Apollo Hospital system.
 */
public class LabTestController {

	/**
	 * API to fetch all available lab tests
	 */
	@PublicAPI
	public void getAllTests() {
		// business logic
	}

	/**
	 * API to book a lab test (authentication required)
	 */
	@PublicAPI
	@RequiresAuth
	public void bookTest() {
		// business logic
	}

	/**
	 * API to delete a test (❌ missing @PublicAPI)
	 */
	@RequiresAuth
	public void deleteTest() {
		// business logic
	}
}
