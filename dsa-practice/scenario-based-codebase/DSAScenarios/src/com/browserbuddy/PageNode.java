package com.browserbuddy;

public class PageNode {
	
    private String url;
    protected PageNode prev;
    protected PageNode next;

    PageNode(String url) {
        this.url = url;
    }
    
    public String getURL() {
    	return url;
    }

}
