package OfficeHours_Saim_Practice_05_3_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfNumberInList {
    public static void main(String[] args) {
        /**
         * String numbers to sum
         * Given an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList.
         * Ex:
         * Input:
         * “123”,“34”,“513”
         * Output:
         * [ 6, 7, 9 ]
         */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123" , "54", "24"));

        for(int i= 0; i < list.size(); i++) {
            int totalSum = 0;
            for (char digit : list.get(i).toCharArray()){ // [1, 2, 3]
                totalSum += Integer.parseInt("" +digit);
            }
            //System.out.println(list);
            list.set(i, "" + totalSum);

        }

        System.out.println(list);
    }
}
