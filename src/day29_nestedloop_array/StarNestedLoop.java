package day29_nestedloop_array;

public class StarNestedLoop {
    public static void main(String[] args) {
/**
 * OUTER 1 - 5
 *     INNER 1- 10
 *
 *
 * * * * * * * * * * *
 * * * * * * * * * * *
 * * * * * * * * * * *
 * * * * * * * * * * *
 * * * * * * * * * * *
 * --------------------------
 *
 * OUTER : 1 - 10
 *     INNER: 1 to OUTER
 *
 * *
 * * *
 * * * *
 * * * * *
 * .....
 */
        for (int outer = 1; outer <= 5; outer++) {
            for (int inner = 1; inner <= 10; inner++) {
                for (int reverse = 0; reverse >= 0; reverse--) {

                }
                System.out.print("* ");

            }
            System.out.println(); // go to the next/new line
        }
        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 0; inner <= outer; inner++) {
                System.out.print("* ");

            }
            System.out.println(); // go to the next/new line

            }
        for(int outer = 1; outer <= 10; outer++) {
            for (int inner = 10; inner >= outer; inner--) {
                System.out.print("* ");

            }
            System.out.println();

        }
        }
    }
