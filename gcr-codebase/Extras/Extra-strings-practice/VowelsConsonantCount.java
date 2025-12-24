// created a class named VowelsConsonantCount that counts the number of vowels and consonants 

public class VowelsConsonantCount{

   public static void main(String[] args){

       String text = "Sarthak Singh rathore";
       int vowelCount =0;
       int consonantCount =0;

       for(int i=0; i< text.length(); i++){
           char ch = text.charAt(i);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
           if( ch == 'a' || ch  == "e" || ch  == "i" 
                    || ch  == "o" || ch  == "u"||ch  == "A" || ch  == "E" 
                     || ch   == "I" || ch  == "O" || ch  == "U" ){
               vowelCount ++;
           }
           else{
               consonantCount++;
           }
       }
       }
       System.out.printn(" Vowels Count : "+ vowelCount + "/n Consonant count: " + consonantCount);

   }
}