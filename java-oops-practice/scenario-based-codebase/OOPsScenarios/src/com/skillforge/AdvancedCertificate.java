package com.skillforge;

public class AdvancedCertificate extends Student {
    public AdvancedCertificate(String name) {
        super(name);
    }

    @Override
    public void generateCertificate() {
        System.out.println(" Advanced Level Certificate awarded to " + name);
    }

}
