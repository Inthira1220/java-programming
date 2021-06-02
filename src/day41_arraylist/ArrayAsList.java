package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums = " + nums);
        //un support operation add, remove, clear
        //nums.add(100);
        //nums.remove(0);
        //nums.clear()
        List<Integer> numsList = new ArrayList<>(Arrays.asList(23, 1, 34, 54, 654));
        System.out.println("nums1 = " + numsList);
        numsList.add(33);
        numsList.add(56);
        System.out.println("numsList = " + numsList);
        numsList.remove(0); // remove index
        System.out.println("numsList = " + numsList);
        numsList.remove(new Integer(34)); //remove number34
        System.out.println("numsList = " + numsList);
        System.out.println("**********************************************");
        /**
         * List String drinksWithCaffeine
         *  coffee, tea, monster, red bull, coke, pepsi, mdew, kambucha, celsius
         *  int caffeineAmount = 0;
         */
        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster"
                , "red bull", "coke", "pepsi", "mdew", "kambucha", "celsius"));
        System.out.println("drinksWithCaffeine = " + drinksWithCaffeine);

        int caffeineAmount = 0;
        for (String eachDrink : drinksWithCaffeine) {

            if (eachDrink.equals("monster") || eachDrink.equals("red bull") || eachDrink.equals("celsius")) {
                caffeineAmount = 150;
                System.out.println(eachDrink + " ==> " + caffeineAmount);
            } else if (eachDrink.equals("coffee") || eachDrink.equals("kabucha")) {
                caffeineAmount = 112;
                System.out.println(eachDrink + " ==> " + caffeineAmount);
            } else if (eachDrink.equals("tea") || eachDrink.equals("coke") || eachDrink.equals("pepsi") || eachDrink.equals("mdew")) {
                caffeineAmount = 35;
                System.out.println(eachDrink + " ==> " + caffeineAmount);
            }
            //System.out.println(eachDrink + " ==> " + caffeineAmount);
        }
        System.out.println("--------------------------------------------------");
        for (String drink : drinksWithCaffeine) {
            switch (drink) {
                case "monster":
                case "redbull":
                case "celcius":
                    caffeineAmount = 150;
                    break;
                case "cofee":
                case "kambucha":
                    caffeineAmount = 112;
                case "tea":
                case "coke":
                case "pepsi":
                    caffeineAmount = 35;
                    break;
            }
            System.out.println(drink + " = " + caffeineAmount);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));

        drinksWithCaffeine.forEach(each -> {
            System.out.println("-------");
            System.out.println("each = " + each);
            System.out.println("-------");
        });
    }
}