package com.annotations.implementrolebasedaccesscontrolwithRoleAllowed;

public class UserContext {

	// Simulated logged-in user role
	static String currentRole;

	static void loginAs(String role) {
		currentRole = role;
	}

	public static void main(String[] args) {

		// Simulate login
		UserContext.loginAs("USER"); // try "ADMIN" also

		// Create object
		AdminService service = new AdminService();

		// Get Class object
		Class<?> clazz = service.getClass();

		// Check if @RoleAllowed is present
		if (clazz.isAnnotationPresent(RoleAllowed.class)) {

			// Get annotation
			RoleAllowed roleAllowed = clazz.getAnnotation(RoleAllowed.class);

			String requiredRole = roleAllowed.value();

			// Compare roles
			if (requiredRole.equals(UserContext.currentRole)) {

				// Access granted
				service.performAdminTask();

			} else {

				// Access denied
				System.out.println("Access Denied!");
			}
		}

	}

}
