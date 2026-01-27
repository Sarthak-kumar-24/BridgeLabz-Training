package com.annotations.createaMaxLengthannotationforfieldvalidation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Annotation should be available at runtime
@Retention(RetentionPolicy.RUNTIME)

// Annotation can be applied only to fields
@Target(ElementType.FIELD)
@interface MaxLength {

    // Maximum allowed length
    int value();
}

