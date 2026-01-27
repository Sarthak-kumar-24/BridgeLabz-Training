package com.annotations.implementcustomserializationannotationJsonField;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Annotation must be available at runtime
@Retention(RetentionPolicy.RUNTIME)

// Annotation can be applied only to fields
@Target(ElementType.FIELD)
@interface JsonField {

    // Custom JSON key name
    String name();
}

