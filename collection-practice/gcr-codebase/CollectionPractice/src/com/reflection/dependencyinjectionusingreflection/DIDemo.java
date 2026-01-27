package com.reflection.dependencyinjectionusingreflection;

/*
 * DIDemo
 * ------
 * Demonstrates dependency injection.
 */
public class DIDemo {

	public static void main(String[] args) {

		DIContainer container = new DIContainer();

		// Request Car object (Engine is injected automatically)
		Car car = container.getBean(Car.class);

		car.drive();
	}
}
