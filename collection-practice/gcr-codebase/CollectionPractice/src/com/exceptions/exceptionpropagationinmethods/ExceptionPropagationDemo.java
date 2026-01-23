package com.exceptions.exceptionpropagationinmethods;

public class ExceptionPropagationDemo {
	
    // This method generates an ArithmeticException (division by zero)
    static void method1() {
        int result = 10 / 0;   // Exception occurs here
    }

    
    // This method calls method1()
    // It does NOT handle the exception, so it propagates further
    static void method2() {
        method1();
    }
    
    // This method calls method2() and handles the exception
    public static void main(String[] args) {

        try {
            // Calling method2(), which internally calls method1()
            method2();

        } catch (ArithmeticException e) {
            // Handling the propagated exception
            System.out.println("Handled exception in main");
        }
    }

}
