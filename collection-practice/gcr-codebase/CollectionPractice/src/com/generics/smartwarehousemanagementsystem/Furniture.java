package com.generics.smartwarehousemanagementsystem;

/**
 * Furniture represents furniture items in the warehouse.
 * Example: Chair, Table, Sofa
 */
public class Furniture extends WarehouseItem{
	
    Furniture(String name) {
        super(name);
    }

    @Override
    void displayInfo() {
        System.out.println("Furniture Item: " + name);
    }

}
