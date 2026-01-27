package com.reflection.createcustomobjectmapper;

/*
 * User
 * ----
 * Sample class for object mapping.
 */
public class User {

    private int id;
    private String name;
    private String email;

    public void display() {
        System.out.println(
            "ID: " + id + ", Name: " + name + ", Email: " + email
        );
    }
}
