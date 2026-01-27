package com.annotations.implementrolebasedaccesscontrolwithRoleAllowed;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Annotation must be available at runtime
@Retention(RetentionPolicy.RUNTIME)

// Applied at class level
@Target(ElementType.TYPE)
@interface RoleAllowed {

	// Role required to access the class
	String value();
}
