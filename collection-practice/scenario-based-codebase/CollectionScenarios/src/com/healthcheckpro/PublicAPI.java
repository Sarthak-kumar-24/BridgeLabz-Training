package com.healthcheckpro;

import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * This annotation marks an API method as publicly accessible.
 */
@Retention(RetentionPolicy.RUNTIME) // Needed for Reflection at runtime
public @interface PublicAPI {

}
