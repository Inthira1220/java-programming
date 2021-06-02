package day20_string_mainpulation;

import javax.swing.*;
import java.util.Locale;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));//<= true
        System.out.println(company.contains("ital")); //<= true
        System.out.println(company.contains("l o"));//true
        System.out.println(company.contains("a"));//true, it doesnt matter how many a in there

        //if company contain space, print "multiple words company name"
        //else "single word company name"

        if (company.contains(" ")) { // <= contain space " "
            System.out.println("multiple words company name");
        } else {
            System.out.println("single word company name");
        }

        String etsyTitle = "Wooden Spoon | Esty";
        //check if " | " is in EstyTittle
        if (etsyTitle.contains(" | ")) {
            System.out.println("True " + etsyTitle + ": Title is pass");
        } else {
            System.out.println("False : Title check Fail!");
        }

        String firstname = "Inthira";
        // check if firstname contain "I" and "a" at the same time
        //firstname.equalsIgnoreCase() ==
        if (firstname.contains("I") && firstname.contains("i")) {
            System.out.println("both I && i are present");   //<================true
        } else {
            System.out.println("I || i not present");
        }
        firstname = "Nadir";
        if (firstname.contains("a") || firstname.contains("i")) {
            System.out.println("a or i are present"); //<================true
        } else {
            System.out.println("nor a or i present");
        }



        String email = "Kefind@gmail.com";
        // check if email contain "@" and ends with ".com"

        if (email.contains("@")&& email.endsWith(".com"))
        {
            System.out.println("Print: " + email + " it contains @ and end with .com");
        }else{
            System.out.println("Invalid email");
        }
        if(email.toLowerCase().contains("k")) { // make K to lower cse first AND check contain
            System.out.println("K is present"); //<================true
        }else{
            System.out.println("K is not present");
        }
    }
}
