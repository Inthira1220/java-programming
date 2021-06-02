package day23_string_manipulation_while_loop;

import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "wooden spoon";
        System.out.println(word.toUpperCase().toUpperCase().length());
        //remove spaces first then print everything uppercase
        System.out.println(word.replace(" ", "").toUpperCase());

        String city = "Chicago";
        System.out.println(city.substring(0, 1).toLowerCase()+city.substring(1));

        String city1 = "thailand";
        System.out.println(city1.substring(0, 1).toUpperCase()+city1.substring(1));
        String capitalized = city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase();

        //String capitalized = city.substring(0, 1).toLowerCase()+city.substring(1).toUpperCase();
        System.out.println("capitalized = " + capitalized);

        //.isEmpty().toUpperCase() Does not work since isEmpty is boolean
    }
}
