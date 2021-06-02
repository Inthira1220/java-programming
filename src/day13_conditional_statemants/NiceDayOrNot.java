package day13_conditional_statemants;
import java.util.Scanner;
public class NiceDayOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type you temperature here!");
        int temp = 70;
        int inputTemp = scan.nextInt();
        if (temp<=inputTemp){
            System.out.println("It is a beautiful day");
            System.out.println("Lets code Java");
        }else{
            System.out.println("its kind of cool today ");
            System.out.println("Lets stay home and code Java");
        }

    }
}
