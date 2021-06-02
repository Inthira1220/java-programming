package OfficeHours_Saim_Practice_04_13_2021;
import java.util.*;
public class SmallestAndLongestWordFromArray {
    public static void main(String[] args) {
//        Shortest and Longest words from String array
//Write a program that can return the shortest string element from a String array
//Write a program that can return the longest string element from a String array
        System.out.println("--Starting Etsy Search Smoke Test--");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("--Etsy Search Smoke Test completed - Pass -");
    }

    public static void openBrowser() {
        System.out.println("Launching Chrome browser");
    }

    public static void navigateToEtsyUrl() {
        System.out.println("Navigating to https://www.etsy.com/ ");
    }

    public static void searchForWoodenSpoon() {
        System.out.println("PASS: Verify Etsy home page is displayed");
        System.out.println("Type 'Wooden spoon' in search field and click search");
    }

    public static void verifyResultsAreDisplayed() {
        System.out.println("PASS: Search results are successfully displayed");
    }
}
