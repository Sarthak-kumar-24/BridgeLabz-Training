package com.annotations.implementacustomcachingsystemwithCacheResult;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheManager {

	// Cache storage
	private static final Map<String, Object> cache = new HashMap<>();

	// Executes method with caching support
	public static Object execute(Object target, String methodName, Object... args) {

		try {
			Class<?> clazz = target.getClass();

			// Get method (single int parameter here for simplicity)
			Method method = clazz.getMethod(methodName, int.class);

			// Check if method has @CacheResult
			if (method.isAnnotationPresent(CacheResult.class)) {

				// Create cache key (method + arguments)
				String cacheKey = methodName + "_" + args[0];

				// If result exists in cache → return it
				if (cache.containsKey(cacheKey)) {
					System.out.println("Returning cached result for " + args[0]);
					return cache.get(cacheKey);
				}

				// Else compute result
				Object result = method.invoke(target, args);

				// Store in cache
				cache.put(cacheKey, result);

				return result;
			}

			// If method not annotated → just invoke normally
			return method.invoke(target, args);

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {

		MathService service = new MathService();

		// First call → computation happens
		System.out.println(CacheManager.execute(service, "expensiveSquare", 5));

		// Second call with same input → cached result
		System.out.println(CacheManager.execute(service, "expensiveSquare", 5));

		// New input → computation happens again
		System.out.println(CacheManager.execute(service, "expensiveSquare", 7));
	}

}
