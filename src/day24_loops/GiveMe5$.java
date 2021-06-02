package day24_loops;
import java.util.Scanner;
public class GiveMe5$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("do you have money? pls give me 5 dollar");
        int dollar = scan.nextInt();

        while (dollar != 5){  //<-------need only $5, when you put 5 loop will exit

            System.out.println("Give me 5 dollar");
            dollar = scan.nextInt();
            }

        System.out.println("Thank you for 5 dollars "); //<---------- outside loop
    }

}
