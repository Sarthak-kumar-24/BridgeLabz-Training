package com.linkedlist.doublylinkedlist;

/**
 * Manages undo and redo functionality using a doubly linked list.
 */
public class UndoRedoManager {

    private TextStateNode head;      // Oldest state
    private TextStateNode tail;      // Latest state
    private TextStateNode current;   // Current editor state

    private final int MAX_HISTORY = 10;
    private int size = 0;

    
    /**
     * Adds a new text state.
     * Clears redo history if user types after undo.
     */
    public void addState(String newText) {

        TextStateNode newNode = new TextStateNode(newText);

        // If list is empty
        if (head == null) {
            head = tail = current = newNode;
            size = 1;
            return;
        }

        // Clear redo history
        if (current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        // Attach new state
        current.next = newNode;
        newNode.prev = current;
        current = tail = newNode;
        size++;

        // Enforce history size limit
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

   

    /**
     * Reverts to the previous text state.
     */
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println(" No more undo available");
        }
    }

    
    /**
     * Re-applies the next text state.
     */
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println(" No more redo available");
        }
    }

    
    /**
     * Displays the current text.
     */
    public void displayCurrentState() {
        if (current == null) {
            System.out.println("Editor is empty");
        } else {
            System.out.println(" Current Text: " + current.text);
        }
    }

   
    public static void main(String[] args) {

        UndoRedoManager editor = new UndoRedoManager();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.addState("Hello Java");
        editor.displayCurrentState();

        editor.redo(); // should fail
    }
}

