package com.reflection.customloggingproxyusingreflection;

/*
 * GreetingImpl
 * ------------
 * Real implementation of Greeting.
 */
public class GreetingImpl implements Greeting {

	@Override
	public void sayHello() {
		System.out.println("Hello! ");
	}
}
