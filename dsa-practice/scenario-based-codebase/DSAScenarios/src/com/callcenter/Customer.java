package com.callcenter;

public class Customer {
	
    int id;
    String name;
    boolean isVIP;
    long callTime;

    Customer(int id, String name, boolean isVIP) {
        this.id = id;
        this.name = name;
        this.isVIP = isVIP;
        this.callTime = System.currentTimeMillis();
    }

}
