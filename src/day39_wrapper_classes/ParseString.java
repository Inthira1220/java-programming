package day39_wrapper_classes;

import java.lang.reflect.Array;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        int num = Integer.parseInt("55");
        System.out.println("count = " + count);
        System.out.println("num = " + num);
        
        String strPrice = "123.99";
        double price = Double.parseDouble(strPrice);
        System.out.println("price = " + price);

        if (price >= 100){
            System.out.println(price +" - yes, price more than $100");
        }
        String sentence = "I wrote 100 lines of code";
        // split by space, parse index 2 to int
        String[] words = sentence.split(" ");

        int linesOfCode = Integer.parseInt(words[2]);
        System.out.println("linesOfCode = " + linesOfCode);
    }
}
