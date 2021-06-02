package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        /**
         * add new class PrintEvenOrOddNumbers
         * 1) print all even numbers between 1-100
         * 2) print all odd numbers between 1-100
         */

        System.out.println("EVEN NUMBERS 0 - 100: ");
        for(int n = 0; n <= 100; n++) {
            if (n % 2 == 0) { //<============between 2 is even number
                System.out.print(n + " ");
            }
        }

        System.out.println("\nODD NUMBERS 0 - 100: ");

        for(int k = 0; k <= 100; k++) {
            if (k % 2 != 0) {  //<============between 2 is even number
                System.out.print(k + " ");
            }
        }
    }
}

