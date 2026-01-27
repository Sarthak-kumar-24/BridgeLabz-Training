package com.annotations.annotationforloggingmethodexecutiontime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Retained at runtime so reflection can access it
@Retention(RetentionPolicy.RUNTIME)

// Annotation can be applied to methods
@Target(ElementType.METHOD)
@interface LogExecutionTime {
}

