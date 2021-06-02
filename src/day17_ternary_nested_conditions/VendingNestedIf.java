package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "snack"; //"drink"
        String drinkItem = "coke";
        String snackItem = "cookies"; // chips

        if (selection.equals("drink")) {
            System.out.println("drink option is selected");
            if (drinkItem.equals("tea")) {
                System.out.println("tea is selected");
            } else {
                System.out.println("coke is selected");
            }
        }else if (selection.equals("snack")) {
                System.out.println("snack option is selected");
                if (drinkItem.equals("chips")) {
                    System.out.println("chips is selected");
                } else {
                    System.out.println("cookies is selected");
                }
            }
        }
    }

//add new class VendingNestedIf
//add main method
//
//        selection = "drink" orr can be "snack"
//        drinkItem = "tea" , "coke"
//        snackItem = "chips" , "candy"
//
//        when selection is "drink":
//        "drink option is selected"
//
//        when drink is "tea":
//        "tea is selected"
//        when drink is "coke":
//        "coke is selected"
//        when selection is "snack"
//        "snack option is selected"
//
//        when snack is "chips":
//        "chips item is selected"
//        when snack is "candy":
//        "candy item is selected"
//
