package OfficeHours_Saim_Practice_03_30_2021;

public class PrefixAgain {
    public static void main(String[] args) {
        /**
         * Given a String str and a number n check if the prefix (made of up of the first n characters)
         * appears in the remaining part of the String. Print true or false.
         *
         * Assume that the String is not empty and that n is in the range from 1 to str.length().
         *
         * Examples:
         *
         * input: abXYabc
         * input: 1
         *
         * output: true
         */
        String str = "abXYabc"; //abXYabc
        int n = 1;      //1
        //prefix = a that the rest of the string have a?
        String prefix = str.substring(0, n);
        String remaining = str.substring(n);
        System.out.println(prefix);
        System.out.println(remaining);
        System.out.println(remaining.contains(prefix)); //<-------------output = ture


    }
}
