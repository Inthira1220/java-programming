package day33_arrays;

import java.util.Arrays;

public class splitReview {
    public static void main(String[] args) {
        String word = "java";
        String[] array = word.split("a");
        System.out.println(array.length);

        int countOfA = array.length - 1;
        //System.out.println("countOfA = " + countOfA);
        if (word.endsWith("a")) { //if ends with a, add one more
            countOfA++;
        }
        System.out.println("countOfA = " + countOfA);

        System.out.println("---------Split with empty String//word2.split(\"\")----------");
        String word2 = "java";
        String[] array1 = word2.split("");
        System.out.println("array1.length - "+array1.length);
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);
        System.out.println(Arrays.toString(array1));

        System.out.println("----------Split any number//word3.split(\"\\\\d\")-------");
        String word3 = "java1sqr2html";
        String[] strArr2 = word3.split("\\d"); //<---\\d split any number
        System.out.println(Arrays.toString(strArr2));

        System.out.println("----------Matching or not//password.matches-------");
        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }


    }
}
