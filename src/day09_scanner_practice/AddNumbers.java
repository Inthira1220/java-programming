package day09_scanner_practice; //-mean this class locate***
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {// <--ไม่มีไลน์นี้ โปรแกรมก็ไม่รัน
        Scanner input = new Scanner(System.in);// after Scanner ชื่อเปลี่ยนได้
        System.out.println("Enter 2 numbers");//
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The total is =" + sum);// it is the result

    }
}

//when you type scanner it will automatically import for you