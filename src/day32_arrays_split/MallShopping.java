package day32_arrays_split;

import java.util.*;

public class MallShopping {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("-----------------Find the index of 'Glove' in items array -----");
        //System.out.println(items[2]);// gloves
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Glove found at index --> " + i);
                break;
            }
        }
        System.out.println(("-----set boolean to true if first 'iPad' is found-------"));
//        boolean iPadExists = false;
//
//        for (int i = 0; i < items.length; i++) {
//            if (items[i].equals("iPad")) {
//                iPadExists = true;
//                break;
//            }
//        }
//        System.out.println("iPadExists = " + iPadExists);
        boolean iPadExists = false;
        for (String i : items) {
            if (i.contains("iPad")) {
                iPadExists = true;
                break;
            }
        }
        System.out.println("IPad exists = " + iPadExists);
        if (iPadExists) {
            System.out.println("we bought the iPad!!");
        } else {
            System.out.println("we forgot the iPad");
        }
        System.out.println("--------------Print the report-----------------");
        /**
         * loop and print all the item
         */
        for (int i = 0; i < items.length; i++) {
            //System.out.println(items[i]+prices[i]+itemIDs[i]);
            System.out.println("item name -" + items[i] + "\t\t\t item price: $" + prices[i] + "\t\tID:#" + itemIDs[i]);
        }
        System.out.println("-----Look for 'Jacket' in items and print all details-----");

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Jacket")) {
                System.out.println(items[i] + "\t - $" + prices[i] + "\t#" + itemIDs[i]);
                break;
            }
        }

    }
}
