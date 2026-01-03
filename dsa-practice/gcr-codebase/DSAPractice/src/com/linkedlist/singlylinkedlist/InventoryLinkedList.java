package com.linkedlist.singlylinkedlist;


/**
 * InventoryLinkedList
 * This program implements an Inventory Management System
 * using a Singly Linked List.
 *
 * Each node stores:
 *  - Item ID
 *  - Item Name
 *  - Quantity
 *  - Price
 *
 * Supported Operations:
 *  - Add item (beginning, end, specific position)
 *  - Remove item by Item ID
 *  - Update quantity by Item ID
 *  - Search item by ID or Name
 *  - Calculate total inventory value
 *  - Sort inventory by Name or Price 
 */
public class InventoryLinkedList {
	// Head of the linked list
    private InventoryNode head;
    
    
    //Adds an item at the beginning of the list
    public void addAtBeginning(int id, String name, int qty, double price) {
    	InventoryNode newNode = new InventoryNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;
    }
    //Adds an item at the end of the list
    
    public void addAtEnd(int id, String name, int qty, double price) {
    	InventoryNode newNode = new InventoryNode(id, name, qty, price);

        if (head == null) {
            head = newNode;
            return;
        }

        InventoryNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    //Adds an item at a specific position (1-based index)
    public void addAtPosition(int position, int id, String name, int qty, double price) {

        if (position == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        InventoryNode newNode = new InventoryNode(id, name, qty, price);
        InventoryNode current = head;

        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println(" Invalid position");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }
    
    //Removes an item using Item ID
    public void removeByItemId(int itemId) {

        if (head == null) {
            System.out.println(" Inventory is empty");
            return;
        }

        if (head.itemId == itemId) {
            head = head.next;
            return;
        }

        InventoryNode current = head;
        while (current.next != null && current.next.itemId != itemId) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println(" Item not found");
        } else {
            current.next = current.next.next;
        }
    }
    
    public void updateQuantity(int itemId, int newQuantity) {
    	InventoryNode current = head;

        while (current != null) {
            if (current.itemId == itemId) {
                current.quantity = newQuantity;
                System.out.println(" Quantity updated");
                return;
            }
            current = current.next;
        }

        System.out.println(" Item not found");
    }
    
    public void searchByItemId(int itemId) {
    	InventoryNode current = head;

        while (current != null) {
            if (current.itemId == itemId) {
                displayItem(current);
                return;
            }
            current = current.next;
        }

        System.out.println(" Item not found");
    }
    
    
    public void searchByItemName(String name) {
    	InventoryNode current = head;

        while (current != null) {
            if (current.itemName.equalsIgnoreCase(name)) {
                displayItem(current);
                return;
            }
            current = current.next;
        }

        System.out.println(" Item not found");
    }
    
    public void calculateTotalValue() {
        double totalValue = 0;
        InventoryNode current = head;

        while (current != null) {
            totalValue += current.price * current.quantity;
            current = current.next;
        }

        System.out.println(" Total Inventory Value: Rs" + totalValue);
    }
    
    
    public void sortByName(boolean ascending) {
        if (head == null) return;

        boolean swapped;
        do {
            swapped = false;
            InventoryNode current = head;

            while (current.next != null) {
                int cmp = current.itemName.compareToIgnoreCase(current.next.itemName);

                if ((ascending && cmp > 0) || (!ascending && cmp < 0)) {
                    swapData(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
    
    
    public void sortByPrice(boolean ascending) {
        if (head == null) return;

        boolean swapped;
        do {
            swapped = false;
            InventoryNode current = head;

            while (current.next != null) {
                if ((ascending && current.price > current.next.price) ||
                    (!ascending && current.price < current.next.price)) {

                    swapData(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
    
    
    private void swapData(InventoryNode a, InventoryNode b) {
        int tempId = a.itemId;
        String tempName = a.itemName;
        int tempQty = a.quantity;
        double tempPrice = a.price;

        a.itemId = b.itemId;
        a.itemName = b.itemName;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemId = tempId;
        b.itemName = tempName;
        b.quantity = tempQty;
        b.price = tempPrice;
    }
    
    public void displayInventory() {
        if (head == null) {
            System.out.println(" Inventory is empty");
            return;
        }

        InventoryNode current = head;
        while (current != null) {
            displayItem(current);
            current = current.next;
        }
    }
    
    private void displayItem(InventoryNode item) {
        System.out.println(
                "ID: " + item.itemId +
                ", Name: " + item.itemName +
                ", Qty: " + item.quantity +
                ", Price: Rs" + item.price
        );
    }
    
    public static void main(String[] args) {

        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addAtEnd(101, "Laptop", 5, 55000);
        inventory.addAtEnd(102, "Mouse", 50, 500);
        inventory.addAtEnd(103, "Keyboard", 30, 1500);
        inventory.addAtBeginning(104, "Monitor", 10, 12000);

        System.out.println(" Inventory:");
        inventory.displayInventory();

        inventory.searchByItemId(102);
        inventory.updateQuantity(103, 40);

        inventory.calculateTotalValue();

        System.out.println("\n Sorted by Price (Ascending):");
        inventory.sortByPrice(true);
        inventory.displayInventory();

        System.out.println("\n Sorted by Name (Descending):");
        inventory.sortByName(false);
        inventory.displayInventory();

        inventory.removeByItemId(101);

        System.out.println("\n After Removal:");
        inventory.displayInventory();
    }
}
    
   
