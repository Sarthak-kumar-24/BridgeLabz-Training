package com.reflection.createcustomobjectmapper;

import java.lang.reflect.Field;
import java.util.Map;

/*
 * ObjectMapperUtil
 * ----------------
 * Maps key-value pairs from a Map
 * to fields of a given class using Reflection.
 */
public class ObjectMapperUtil {

    // Generic method to map Map -> Object
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {

        try {
            // Create object dynamically using default constructor
            T obj = clazz.getDeclaredConstructor().newInstance();

            // Iterate over all fields of the class
            for (Field field : clazz.getDeclaredFields()) {

                // Get field name
                String fieldName = field.getName();

                // Check if map contains matching key
                if (properties.containsKey(fieldName)) {

                    // Disable access checks (for private fields)
                    field.setAccessible(true);

                    // Set value from map to field
                    field.set(obj, properties.get(fieldName));
                }
            }

            return obj;

        } catch (Exception e) {
            throw new RuntimeException("Object mapping failed", e);
        }
    }
}
