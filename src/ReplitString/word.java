package ReplitString;

public class word {
    public static void main(String[] args) {
        /**
         * In this assignment you are given two string variables word1 and word2.
         * Check if they are equal
         * Comparison should be case sensitive. "java" and "JaVa" are not equal.
         * if they are equal output "word1 equals word2"
         * otherwise output "word1 does not equal word2"
         * Input:
         * java
         * java
         * output:
         * word1 equals word2
         */
        String word1 = "java";
        String word2 = "java";
        //if(word1.equalsIgnoreCase(word1) == word2.equalsIgnoreCase(word2)) {
        if(word1.toLowerCase() == word2.toLowerCase()) {
            System.out.println("word1 equals word2");
        }else{
            System.out.println("word1 does not equal word2");
        }
    }
}
