package day20_string_mainpulation;

import java.lang.*; // its automatic imported to each class we dont have to type in the program

public class StringCreationMethod {

    public static void main(String[] args) {
        String word1 = "potato";
        String word2 = new String("tomato");
        String word3 = "";
        String word4 = new String();//<= it doesnt import everything in the () same as line 10

        System.out.println(word1 + ("") + word2);
        System.out.println("hello");

        String car = "lexus";
        //System.out.println(car.length()); //5

        if (car.isEmpty()) {
            System.out.println("False");
        }else{
            System.out.println("true");
        }
    }
}
