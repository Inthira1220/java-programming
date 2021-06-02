package day23_string_manipulation_while_loop;

public class WhileLoopJavaShort {
    public static void main(String[] args) {
        int apples = 1;
        while (apples <= 5) {
            System.out.println("im eating an apple = " + apples);
            apples++;
        }
        System.out.println("No more apple.");

        int num1 = 0;
        while (num1 <= 100) {
            System.out.print(num1 + ", ");
            num1 += 5; //<----------------add every other 5 number
        }
        System.out.println();
        num1 = 1;
        while (num1 <= 20) {
            if (num1 % 2 == 0)
                System.out.print(num1 + ", ");
            num1++;

        }
    }
}
