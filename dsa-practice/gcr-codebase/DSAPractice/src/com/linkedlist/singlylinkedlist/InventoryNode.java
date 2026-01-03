package com.linkedlist.singlylinkedlist;

//InventoryNode represents one inventory item
public class InventoryNode {
	
    int itemId;
    String itemName;
    int quantity;
    double price;
    InventoryNode next;
    
    InventoryNode(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }

}
