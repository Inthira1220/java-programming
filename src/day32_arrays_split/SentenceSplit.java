package day32_arrays_split;

import java.util.*;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] wordsArrays = sentence.split(" ");
        System.out.println("1st word = " + wordsArrays[0]);
        System.out.println("2nd word = " + wordsArrays[1]);
        System.out.println("3rd word = " + wordsArrays[2]);
        System.out.println(wordsArrays.length);
        //code classmate pls look at it
        int count = 0;
        int count1 = 1;
        for ( String each : wordsArrays ){
            System.out.println( count1 +"st word = " + wordsArrays[count]);
            count1++;
            count++;
        }
        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] results = googleResult.split(" ");
        System.out.println("Count = "+ results[1]);
        System.out.println("second = "+ results[3]); //second = (0.68
        System.out.println("second = "+ results[3].replace("(", "")); //second = 0.68
        System.out.println("second = "+ results[3].substring(1)); //second = 0.68

    }
}
