package com.reflection.customloggingproxyusingreflection;

import java.lang.reflect.Proxy;

/*
 * DynamicProxyDemo
 * ----------------
 * Demonstrates custom logging proxy.
 */
public class DynamicProxyDemo {

	public static void main(String[] args) {

		// Real object
		Greeting realGreeting = new GreetingImpl();

		// Create proxy
		Greeting proxyGreeting = (Greeting) Proxy.newProxyInstance(Greeting.class.getClassLoader(),
				new Class<?>[] { Greeting.class }, new LoggingInvocationHandler(realGreeting));

		// Call method via proxy
		proxyGreeting.sayHello();
	}
}
