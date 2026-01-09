package com.skillforge;

public class BeginnerCertificate extends Student {
    public BeginnerCertificate(String name) {
        super(name);
    }

    @Override
    public void generateCertificate() {
        System.out.println(" Beginner Level Certificate awarded to " + name);
    }

}
