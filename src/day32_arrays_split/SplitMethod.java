package day32_arrays_split;

import java.util.*;

public class SplitMethod {
    public static void main(String[] args) {
                        //  0   1       2       3
        String words = "java,python,selenium,html";
        String[] wordsArray = words.split(",");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of Array = " + wordsArray.length);

        // try to loop example
        for (String each : wordsArray) {
            System.out.println(each);

        }
        String sentence = "today I am coding java arrays";
        String[] wordInSentenceArray = sentence.split(" ");
        System.out.println("First word - "+ wordInSentenceArray[0]); // today
        System.out.println("First word - "+ sentence.split(" ")[0]); // today
        System.out.println("Number of words in sentence = "+wordInSentenceArray.length); //6
        // try to loop example
        for (String each : wordInSentenceArray) {
            System.out.println(each);


        }
    }
}
