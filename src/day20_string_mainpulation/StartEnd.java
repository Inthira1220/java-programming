package day20_string_mainpulation;

import java.util.Scanner;

public class StartEnd {
    public static void main(String[] args) {
        /**
         * Enter start and end
         * int start
         * int end
         * print all numbers from start till end separated by space
         * start = 3
         * end = 6
         * 3 4 5 6
         * start = 30
         * end = 6
         * when start is more than end,
         *     "reverse numbering is not supported"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Start Number: ");
        int start = scan.nextInt();
        System.out.println("Please Enter Start Number: ");
        int end = scan.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        if (start > end) {
            System.out.print("reverse numbering is not supported");

        }


    }
}
