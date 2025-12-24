
//Class Name: LongestWordFinder that finds the longest word in a given sentence without using split().


public class LongestWordFinder {


    public static String  findLongestWord(String sentence) {

        String longestWord = "";
        String currentWord = "";

        // Traverse each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            // Build the word until space is found
            if (ch != ' ') {
                currentWord += ch;
            } else {
                // Compares lengths when space is encountered
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                currentWord = ""; // reset for next word
            }
        }

        // Final check for the last word
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord;
        }

        return longestWord;
    }

    public static void main(String[] args) {

        String sentence = "Java programming is super powerful";

        String longestWord = findLongestWord(sentence);

        System.out.println("Sentence     : " + sentence);
        System.out.println("Longest Word : " + longestWord);
    }
}
