package com.reflection.generateJSONrepresentation;

/*
 * User
 * ----
 * Sample class to be converted into JSON-like string.
 */
public class User {

    private int id;
    private String name;
    private String email;
    private boolean active;

    public User(int id, String name, String email, boolean active) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.active = active;
    }
}

