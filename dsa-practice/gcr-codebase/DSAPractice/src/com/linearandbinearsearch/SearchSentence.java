package com.linearandbinearsearch;


/*  Search for a Specific Word in a List of Sentences
 * 
 * You are given an array of sentences (strings). 
 * a program that performs Linear Search to find the first sentence containing a specific word. 
 * If the word is found, return the sentence. 
 * If no sentence contains the word, returns "Not Found".
 * 
 */
public class SearchSentence {
	
    public static String findSentence(String[] sentences, String word) {

        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].contains(word)) {
                return sentences[i];   // first match
            }
        }

        return "Not Found";
    }

	public static void main(String[] args) {
		
        String[] sentences = {
                "Java is a powerful language",
                "I love data structures",
                "Linear search is simple",
                "Practice makes perfect"
            };

            String word = "search";

            String result = findSentence(sentences, word);

            System.out.println(result);
		

	}

}
