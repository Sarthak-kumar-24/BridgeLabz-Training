package com.reflection.accessprivatefield;

import java.lang.reflect.Field;

/*
 * AccessPrivateFieldDemo
 * ----------------------
 * Demonstrates accessing and modifying
 * a private field using Reflection.
 */
public class AccessPrivateFieldDemo {

    public static void main(String[] args) {

        try {
            // Create object normally
            Person person = new Person(21);

            System.out.println("Before Reflection → Age: " + person.getAge());

            // Get Class object
            Class<?> cls = person.getClass();

            // Access private field 'age'
            Field ageField = cls.getDeclaredField("age");

            // Disable access checks (VERY IMPORTANT)
            ageField.setAccessible(true);

            // Modify private field value
            ageField.set(person, 30);

            // Retrieve updated value
            int updatedAge = (int) ageField.get(person);

            System.out.println("After Reflection → Age: " + updatedAge);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

