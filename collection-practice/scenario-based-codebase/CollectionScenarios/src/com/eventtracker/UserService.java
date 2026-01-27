package com.eventtracker;

/**
 * This class represents user actions performed in an enterprise system.
 */
public class UserService {

	/**
	 * User login action
	 */
	@AuditTrail(action = "LOGIN", module = "AUTH")
	public void loginUser() {
		// login logic
	}

	/**
	 * File upload action
	 */
	@AuditTrail(action = "UPLOAD_FILE", module = "STORAGE")
	public void uploadFile() {
		// upload logic
	}

	/**
	 * File delete action
	 */
	@AuditTrail(action = "DELETE_FILE", module = "STORAGE")
	public void deleteFile() {
		// delete logic
	}

	/**
	 * Non-audited method
	 */
	public void helperMethod() {
		// utility logic
	}
}
