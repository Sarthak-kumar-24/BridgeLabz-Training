package com.annotations.implementacustomcachingsystemwithCacheResult;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Retained at runtime so reflection can read it
@Retention(RetentionPolicy.RUNTIME)

// Can be applied only to methods
@Target(ElementType.METHOD)
@interface CacheResult {
}

