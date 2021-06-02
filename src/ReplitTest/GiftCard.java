package ReplitTest;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        int balance = 100;
        boolean isValid = true;
//        int blanket = 60;
//        int charger = 25;
//        int hat = 25;
//        int headPhones = 30;
//        int laptop = 200;
//        int pants = 50;
//        int pillow = 40;
//        int smartphone = 1000;
//        int socks = 5;
//        int usbCable = 10;

        if(item.equals("Blanket")){
            balance-=60;
        }else if(item.equals("Charger")){
            balance-=25;
        }else if(item.equals("Hat")){
            balance-=25;
        }else if(item.equals("Headphones")){
            balance-=30;
        }else if(item.equals("Laptop")){
            balance-=200;
        }else if(item.equals("Pants")){
            balance-=50;
        }else if(item.equals("Pillow")){
            balance-=40;
        }else if(item.equals("Smartphone")){
            balance-=1000;
        }else if(item.equals("Socks")){
            balance-=5;
        }else if(item.equals("USB cable")){
            balance-=10;
        }else{
            System.out.println("Invalid item!");
        }
        if(isValid && balance >0) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + balance + "$");
        }else if(balance<0 && isValid){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else{
            System.out.println("Invalid item!");
        }
    }
}
