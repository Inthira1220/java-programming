package ReplitTest;
import java.util.Scanner;
public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num > 1){
            System.out.println("positive");
        }else if (num < 0){
            System.out.println("negative");
        }else if (num == 0){
            System.out.println("zero");
        }
    }
}
/*
Main.java:12: error: incompatible types: int cannot be converted to boolean
}else if (num -=6){
^
1 error
compiler exit status 1
 */