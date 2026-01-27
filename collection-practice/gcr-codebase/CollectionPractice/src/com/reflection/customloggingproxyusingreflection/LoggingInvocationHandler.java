package com.reflection.customloggingproxyusingreflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
 * LoggingInvocationHandler
 * ------------------------
 * Intercepts method calls and logs them.
 */
public class LoggingInvocationHandler implements InvocationHandler {

	private final Object target;

	public LoggingInvocationHandler(Object target) {
		this.target = target;
	}

	// This method is called automatically for every method invocation
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		// Log before method execution
		System.out.println(" Calling method: " + method.getName());

		// Call actual method
		return method.invoke(target, args);
	}
}
