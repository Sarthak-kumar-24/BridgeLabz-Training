package com.ambulanceroute;

public class UnitNode {
	
    String name;
    boolean available;
    UnitNode next;

    UnitNode(String name, boolean available) {
        this.name = name;
        this.available = available;
    }

}
