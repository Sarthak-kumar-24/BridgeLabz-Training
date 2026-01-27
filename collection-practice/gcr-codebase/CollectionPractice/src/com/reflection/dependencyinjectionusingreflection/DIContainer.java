package com.reflection.dependencyinjectionusingreflection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/*
 * DIContainer
 * -----------
 * Simple dependency injection container.
 */
public class DIContainer {

	// Cache to avoid creating multiple instances
	private final Map<Class<?>, Object> container = new HashMap<>();

	// Create object with injected dependencies
	public <T> T getBean(Class<T> clazz) {

		try {
			// Return existing instance if present
			if (container.containsKey(clazz)) {
				return clazz.cast(container.get(clazz));
			}

			// Create object dynamically
			T instance = clazz.getDeclaredConstructor().newInstance();

			// Scan fields for @Inject
			for (Field field : clazz.getDeclaredFields()) {

				if (field.isAnnotationPresent(Inject.class)) {

					field.setAccessible(true);

					// Get dependency type
					Class<?> dependencyType = field.getType();

					// Recursively create dependency
					Object dependency = getBean(dependencyType);

					// Inject dependency
					field.set(instance, dependency);
				}
			}

			// Cache instance
			container.put(clazz, instance);

			return instance;

		} catch (Exception e) {
			throw new RuntimeException("Failed to create bean: " + clazz.getName(), e);
		}
	}
}
