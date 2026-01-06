package com.stringbuilderandbuffer;

/* Concatenate Strings Efficiently Using StringBuffer
 * 
 * given an array of strings. 
 * a program that uses StringBuffer to concatenate all the strings in the array efficiently.
 * 
 */
public class ConcatStringsUsingBuffer {
	
	public static  String concatenate( String[] arr) {
		
		StringBuffer buffer = new StringBuffer();
		for( String str: arr) {
			
			buffer.append(str);
		}
		
		return buffer.toString();
		
	}

	public static void main(String[] args) {
		
		
		String[] input = {"Java", " ","is"," ", "awesome"};
		String result = concatenate(input);
		
		System.out.println("Concatenated String: " + result);
		


	}
	
	
	

}
