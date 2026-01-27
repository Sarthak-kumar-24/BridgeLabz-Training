package com.eventtracker;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Custom annotation to mark methods
 * whose execution must be audited.
 */
@Retention(RetentionPolicy.RUNTIME) // Required for Reflection
public @interface AuditTrail {

    // Action name (e.g., LOGIN, DELETE_FILE)
    String action();

    // Module or feature name
    String module();
}
