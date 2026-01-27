package com.annotations.createcustomannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Annotation will be available at runtime
@Retention(RetentionPolicy.RUNTIME)

// Annotation can be applied to methods
@Target(ElementType.METHOD)
@interface TaskInfo {

    // Annotation fields
    int priority();
    String assignedTo();
}
