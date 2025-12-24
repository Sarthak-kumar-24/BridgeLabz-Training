//created a class named  RemoveDuplicateCharacters that removes duplicates 


public class RemoveDuplicateCharacters{

   public static String removeDuplicates(String[] args){


        StringBuilder result = new StringBuilder();
        boolean[] visited = new boolean[256]; // ASCII character set

        // Traverse each character
        for (int i = 0;  i < text.length();  i++) {

            char ch = text.charAt(i);

            // If character is not visited, add it
            if (!visited[ch]) {
                visited[ch] = true;
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String text = "programming";

        String output = removeDuplicates(text);

        System.out.println("Original String : " + text);
        System.out.println("Modified String : " + output);
    }
}



