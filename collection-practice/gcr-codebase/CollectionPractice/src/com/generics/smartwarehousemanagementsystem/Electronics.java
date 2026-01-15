package com.generics.smartwarehousemanagementsystem;

/**
 * Electronics represents electronic items in the warehouse.
 * Example: Laptop, Mobile, TV
 */
public class Electronics extends WarehouseItem{
	
    Electronics(String name) {
        super(name);
    }

    @Override
    void displayInfo() {
        System.out.println("Electronics Item: " + name);
    }

}
