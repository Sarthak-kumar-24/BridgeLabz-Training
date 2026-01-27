package com.annotations.suppressuncheckedwarnings;

import java.util.ArrayList;

public class Main {

    // Suppresses unchecked warnings in this method
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // Creating ArrayList WITHOUT generics (raw type)
    	@SuppressWarnings("unchecked")
        ArrayList list = new ArrayList();

        // Adding different types of data
        list.add("Java");
        list.add(100);
        list.add(99.9);

        // Retrieving value with explicit casting
        String value = (String) list.get(0);

        System.out.println(value);
    }
}

