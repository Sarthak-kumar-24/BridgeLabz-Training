package com.linkedlist.doublylinkedlist;

/**
 * Represents a single state of text in the editor.
 * This node is part of a doubly linked list.
 */
  public class TextStateNode {

    String text;              // Snapshot of text at this state
    TextStateNode prev;       // Previous state (Undo)
    TextStateNode next;       // Next state (Redo)

    TextStateNode(String text) {
        this.text = text;
        this.prev = null;
        this.next = null;
    }
}
