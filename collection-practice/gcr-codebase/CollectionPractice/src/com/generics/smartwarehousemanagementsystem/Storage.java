package com.generics.smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Storage is a generic class used to store warehouse items.
 *
 * Bounded Type Parameter:
 * T must extend WarehouseItem
 */
public class Storage<T extends WarehouseItem> {
	
   private List<T> items = new ArrayList<>();

    /**
     * Adds an item to the storage
     */
    void addItem(T item) {
        items.add(item);
    }

    /**
     * Returns all stored items
     */
    List<T> getItems() {
        return items;
    }

}
