package com.stringbuilderandbuffer;

/* Reverse a String Using StringBuilder
 * 
 * Write a program that uses StringBuilder to reverse a given string. 
 * For example, if the input is "hello", the output should be "olleh".
 * 
 * 
 * Create a new StringBuilder object.
 * Append the string to the StringBuilder.
 * Use the reverse() method of StringBuilder to reverse the string.
 */
public class ReverseStringUsingBuilder {
	
	public static String reverse(String input) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(input);
		sb.reverse();
		return sb.toString();   
	}

	public static void main(String[] args) {
        String input = "hello";
        String output = reverse(input);

        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + output);
		

	}

}
