package ReplitTest;
import java.util.Scanner;
public class sumOfPositiveNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = 0;
        System.out.println("Enter a positive integer");
        int nextNum = scan.nextInt();
        while (nextNum > 0) { // once you add -(minus) in the number it will exit from the loop
            total = total + nextNum;
            nextNum = scan.nextInt();
        }
            System.out.print("sum of all numbers: "+ total);
        }
    }


