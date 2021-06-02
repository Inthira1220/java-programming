package day23_string_manipulation_while_loop;

import java.util.Locale;

public class ChainingStringMethod2 {
    public static void main(String[] args) {
        String word = "wooden spoon";

        System.out.println(word.toUpperCase().length()); //<====12
         word = "woo den sp oon";
         // remove space and change to upper case
        System.out.println(word.toUpperCase().replace(" ", "")); //<---WOODENSPOON

        String city = "chicago";

        System.out.println(city.substring(0, 1));//<---c
        //city = city.substring(0, 1);
        System.out.println(city.substring(0, 1).toUpperCase()+city.substring(1));//<---Chicago

        String name = "inthira";
        System.out.println(name.substring(0, 1));//<---------i
        System.out.println(name.substring(0, 1).toUpperCase()+ name.substring(1));//<----Inthira

    }
}
