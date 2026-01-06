package com.stringbuilderandbuffer;

import java.util.HashSet;

/* Remove Duplicates from a String Using StringBuilder
 * 
 * program that uses StringBuilder to remove all duplicate characters from a given string
 * 
 * 
 */
public class RemoveDuplicatesUsingBuilder {
	
	public static String removeDuplicates( String input) {
		
		StringBuilder sb = new StringBuilder();
		HashSet<Character> seen = new HashSet<>();
		
		for( int i=0; i< input.length();i++) {
			char ch = input.charAt(i);
			
			if(!seen.contains(ch)) {
				seen.add(ch);
				sb.append(ch);
			}
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		
		String input = "sarthaksinghrathore";
		
		String output = removeDuplicates(input);
		
        System.out.println("Original String : " + input);
        System.out.println("Without Duplicates : " + output);
		
        

	}

}
