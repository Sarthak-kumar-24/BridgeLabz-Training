package com.generics.smartwarehousemanagementsystem;

/**
 * Groceries represents grocery items in the warehouse.
 * Example: Rice, Milk, Fruits
 */
public class Groceries extends WarehouseItem{
	
    Groceries(String name) {
        super(name);
    }

    @Override
    void displayInfo() {
        System.out.println("Grocery Item: " + name);
    }

}
