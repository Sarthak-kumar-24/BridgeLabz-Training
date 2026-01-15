package com.generics.smartwarehousemanagementsystem;

/**
 * WarehouseItem is an abstract base class
 * representing a generic item stored in the warehouse.
 *
 * All specific item types (Electronics, Groceries, Furniture)
 * must extend this class.
 */
public abstract class WarehouseItem {
	
    protected String name;

   
    WarehouseItem(String name) {
        this.name = name;
    }

    // Abstract method to display item details
    abstract void displayInfo();

}
