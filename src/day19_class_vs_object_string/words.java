package day19_class_vs_object_string;

import java.util.Locale;

public class words {
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = "jav";


        if(word1.toLowerCase() == word2.toLowerCase()) {
            System.out.println("word1 equals word2");
        } else {
            System.out.println("word1 does not equal word2");
        }
    }
}