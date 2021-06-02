package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        /**
         * if number less than 1 or more than 10
         * print "error":invalid input
         * exit: return;
         */
        int num = 2;
        int total;

        if (num < 1 || num > 10) {
            System.out.println("ERROR: invalid input");
            return;}
            for (int i = 1; i <= 10; i++) {

                total = num * i;
                System.out.println(num + " * " + i + " = " + total);
            }
        }
    }
