package com.annotations.createannotationforpendingtasks;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Annotation should be available at runtime (needed for reflection)
@Retention(RetentionPolicy.RUNTIME)

// Annotation can be applied to methods only
@Target(ElementType.METHOD)
@interface Todo {

    // Description of the pending task (mandatory)
    String task();

    // Developer responsible (mandatory)
    String assignedTo();

    // Priority of the task (optional, default = MEDIUM)
    String priority() default "MEDIUM";
}

