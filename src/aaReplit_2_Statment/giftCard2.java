package aaReplit_2_Statment;

public class giftCard2 {
    public static void main(String[] args) {
//        List of items
//        Blanket - 60$
//        Charger - 25$
//        Hat - 25$
//        Headphones - 30$
//        Laptop - 200$
//        Pants - 50$
//        Pillow - 40$
//        Smartphone - 1000$
//        Socks - 5$
//        USB cable - 10$
//        Let's say I've got a 100$ gift card and you want to buy something in your online store .
//        Write a program that will help me to buy something and display leftover balance after purchase.
//
//        If item is not in the list, display message: "Invalid item!".
//                If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".

        int balance = 100;
        boolean isInvalid = true;
        String item = "";
        if (item.equals("Blanket")){
            balance=-60;
        }else{
            isInvalid=false;
        }


        if( isInvalid && balance >= 0){
            System.out.println("Thank you for you purchase");

        }else if (balance < 100 && isInvalid){
            System.out.println("Sorry, not enough funds on your gift card!");

        }else{
            System.out.println("Invalid item!");
        }

    }
}
