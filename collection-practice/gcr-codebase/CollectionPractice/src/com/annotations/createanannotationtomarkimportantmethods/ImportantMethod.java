package com.annotations.createanannotationtomarkimportantmethods;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Annotation will be available at runtime (required for reflection)
@Retention(RetentionPolicy.RUNTIME)

// Annotation can be applied only to methods
@Target(ElementType.METHOD)
@interface ImportantMethod {

	// Optional parameter with default value
	String level() default "HIGH";
}
