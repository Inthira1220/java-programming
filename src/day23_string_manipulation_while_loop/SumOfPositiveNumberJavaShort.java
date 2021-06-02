package day23_string_manipulation_while_loop;
import java.util.Scanner;
public class SumOfPositiveNumberJavaShort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Positive Number");
        int total = 0;
        int nextNum = scan.nextInt();

        while (nextNum >0){
            total = total + nextNum;
            nextNum =  scan.nextInt();
        }
        System.out.println("sum of all number: "+ total);
    }
}
