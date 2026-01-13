package com.smartcheckout;

import java.util.List;

/*
 * Customer Class containing list of items to purchase
 */
public class Customer {
	
    String name;
    List<String> items;

    Customer(String name, List<String> items) {
        this.name = name;
        this.items = items;
    }

}
