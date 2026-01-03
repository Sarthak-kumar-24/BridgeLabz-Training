package com.hashmap;

/**
 * Custom HashMap using Separate Chaining.
 */
class CustomHashMap {

    // Node class (Linked List entry)
    static class Entry {
        int key;
        String value;
        Entry next;

        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 5;
    private Entry[] buckets;

    CustomHashMap() {
        buckets = new Entry[SIZE];
    }

    /* ================= HASH FUNCTION ================= */

    private int getIndex(int key) {
        return Math.abs(key) % SIZE;
    }

    /* ================= PUT ================= */

    public void put(int key, String value) {

    	
        int index = getIndex(key);
        Entry head = buckets[index];

        // Check if key already exists
        Entry current = head;
        while (current != null) {
            if (current.key == key) {
                current.value = value; // update
                return;
            }
            current = current.next;
        }

        // Insert at beginning of linked list
        Entry newEntry = new Entry(key, value);
        newEntry.next = head;
        buckets[index] = newEntry;
    }

    /* ================= GET ================= */

    public String get(int key) {

        int index = getIndex(key);
        Entry current = buckets[index];

        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }

        return null; // not found
    }

    /* ================= REMOVE ================= */

    public void remove(int key) {

        int index = getIndex(key);
        Entry current = buckets[index];
        Entry prev = null;

        while (current != null) {
            if (current.key == key) {
                if (prev == null) {
                    buckets[index] = current.next; // remove head
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < buckets.length; i++) {
            sb.append("Bucket ").append(i).append(": ");

            Entry current = buckets[i];
            if (current == null) {
                sb.append("null");
            } else {
                while (current != null) {
                    sb.append("[")
                      .append(current.key)
                      .append("=")
                      .append(current.value)
                      .append("] -> ");
                    current = current.next;
                }
                sb.append("null");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    
    
    public static void main(String[] args) {

        CustomHashMap map = new CustomHashMap();

        map.put(10, "A");
        map.put(14, "B");
        map.put(19, "C");
        map.put(5, "D");
        map.put(18, "E");
        map.put(35, "C");
        map.put(40, "F");
        map.put(45, "C");
        map.put(11, "A");
        map.put(16, "B");
        map.put(21, "C");
        map.put(6, "D");
        map.put(13, "E");
        map.put(36, "C");
        map.put(41, "F");
        map.put(44, "C");
        

        System.out.println(map.get(10)); // A
        System.out.println(map.get(15)); // B

        map.remove(10);

        System.out.println(map.get(10)); // null
        
        System.out.println(map.toString());
    }
}
