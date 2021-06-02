package day35_methods_with_param;

public class VoidMethods {
    public static void main(String[] args) {
        /**
         * method name: printAtoZ
         * A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
         */
        printAtoZ();
        for (int i = 0; i < 10; i++) {
            printAtoZ();

        }

        displayUSFlag();
    }

    public static void printAtoZ() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * displayUSFlag
     * This method should print flag of USA in console.
     */
    public static void displayUSFlag() {
        System.out.println("-------------Flag of USA--------");
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }

        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }
}
