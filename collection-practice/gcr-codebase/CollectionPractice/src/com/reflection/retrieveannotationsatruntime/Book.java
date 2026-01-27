package com.reflection.retrieveannotationsatruntime;

/*
 * Book
 * ----
 * Sample class annotated with @Author.
 */
@Author(name = "Sarthak Rathore")
public class Book {

    public void display() {
        System.out.println("Book class");
    }
}

