package OfficeHours_Saim_Practice_03_30_2021;

import java.util.Scanner;

public class DynamicLetters {
    public static void main(String[] args) {
        /**
         * [Dynamic alphabet]
         * • Write a program that will ask ‘upper’ or ‘lower’
         * • If it is upper: print the alphabet in all uppercase letter from A to Z • If it is
         * lower: print the alphabet in all uppercase letter from a to z
         * - Challenge: Also ask if they want to show the alphabet in ascending or order descending
         * - Ascending:A–Zora–z
         * - Descending:Z–Aorz–a
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want uppercase or lowercase");
        String upperOrLower = scan.nextLine();
        //System.out.println("Do you want it in ascending or descending order");
        // String ascendingOrDescending = scan.nextLine();
        int starting;
        int ending;

        if (upperOrLower.equals("uppercase")) { //<----------------uppercase if put lowercase will go to else
            starting = 'A';
            ending = 'Z';
        } else {
            starting = 'a';
            ending = 'z';
        }
        //if (ascendingOrDescending.equals("ascending")) {
            for (int i = starting; i <= ending; i++) { //<----how to get A-Z
                System.out.print((char) i + " "); //<--------casting i and convert i to char
            }
        }

    }
//} //<------------ in line19, 20, 31 and 38 are optional