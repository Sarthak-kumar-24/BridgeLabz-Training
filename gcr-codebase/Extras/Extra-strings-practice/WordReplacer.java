/*
  Class Name: WordReplacer
  Replaces a given word with another word in a sentence
  without using built-in replace methods.
 */
public class WordReplacer {


    // Replaces all occurrences of a word in a sentence.
    public static String replaceWord(String sentence, String oldWord, String newWord) {

        StringBuilder result = new StringBuilder();
        String currentWord = "";

        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            // Builds word until space is found
            if (ch != ' ') {
                currentWord += ch;
            } else {
                // Word boundary reached
                if (currentWord.equals(oldWord)) {
                    result.append(newWord);
                } else {
                    result.append(currentWord);
                }

                result.append(' ');
                currentWord = "";
            }
        }

        // Handle last word
        if (currentWord.equals(oldWord)) {
            result.append(newWord);
        } else {
            result.append(currentWord);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String sentence = "Java is very powerful";
        String oldWord = "very";
        String newWord = "extremely";

        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        System.out.println("Original Sentence : " + sentence);
        System.out.println("Modified Sentence : " + modifiedSentence);
    }
}
