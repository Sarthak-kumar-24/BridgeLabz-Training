package com.healthcheckpro;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * This annotation indicates that the API requires authentication.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface RequiresAuth {
}