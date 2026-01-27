package com.eventtracker;

//Import reflection classes
import java.lang.reflect.Method;

//Import date-time classes
import java.time.LocalDateTime;

//Import collections
import java.util.ArrayList;
import java.util.List;

//Import Jackson ObjectMapper for JSON output
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * EventTracker scans classes using Reflection, detects audited methods, and
 * generates JSON logs.
 */
public class EventTracker {

	public static void main(String[] args) {

		try {
			// Class to be scanned for audit events
			Class<?> targetClass = UserService.class;

			// List to store audit logs
			List<AuditLog> auditLogs = new ArrayList<>();

			// Loop through all declared methods
			for (Method method : targetClass.getDeclaredMethods()) {

				// Check if method is annotated with @AuditTrail
				if (method.isAnnotationPresent(AuditTrail.class)) {

					// Read annotation metadata
					AuditTrail audit = method.getAnnotation(AuditTrail.class);

					// Capture current timestamp
					String timestamp = LocalDateTime.now().toString();

					// Create audit log entry
					AuditLog log = new AuditLog(targetClass.getSimpleName(), method.getName(), audit.action(),
							audit.module(), timestamp);

					// Add log to list
					auditLogs.add(log);
				}
			}

			// Create ObjectMapper for JSON serialization
			ObjectMapper mapper = new ObjectMapper();

			// Convert audit logs to formatted JSON
			String jsonOutput = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(auditLogs);

			// Print JSON audit logs
			System.out.println(jsonOutput);

		} catch (Exception e) {
			// Handle reflection or JSON errors
			e.printStackTrace();
		}
	}
}
