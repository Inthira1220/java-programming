package day32_arrays_split;

import java.util.*;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        // 1) find and print details of most expensive item
        // 2) find and print details of least expensive item

        //print array values as String, in the same line, with no loop
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));

        System.out.println("1) find and print details of most expensive item");
        double maxPrice = prices[0]; //assume first price is max
        int indexOfMaxPrice = 0; //assume max price is at index 0
        double leastPrice = prices[0];
        int indexOfLeastPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                indexOfMaxPrice = i;
            }
        }
        System.out.println("maxPrice = " + maxPrice);
        System.out.println("indexOfMaxPrice = " + indexOfMaxPrice);
        System.out.println("itemIDS = " + items[indexOfMaxPrice]);
        System.out.println(items[indexOfMaxPrice] + " - $" + prices[indexOfMaxPrice] + " - #" + itemIDs[indexOfMaxPrice]);

        System.out.println("2) find and print details of least expensive item");
        for (int j = 0; j < prices.length; j++) {
            if (prices[j] < leastPrice) {
                leastPrice = prices[j];
                indexOfLeastPrice = j;
            }
        }
        System.out.println("leastExpensive = " + leastPrice);
        System.out.println("indexOfLeast = " + indexOfLeastPrice);
        System.out.println("itemIDS = " + items[indexOfLeastPrice]);
        System.out.println(items[indexOfLeastPrice] + " - $" + prices[indexOfLeastPrice] + " #" + itemIDs[indexOfLeastPrice]);
    }
}

