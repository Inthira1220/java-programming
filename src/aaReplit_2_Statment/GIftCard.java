package aaReplit_2_Statment;

public class GIftCard {
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

        int giftCard = 100;

        String item = "pillow";

        boolean isValid = true;

        if(item.equals("hat")){
            //giftCard-=25;
            System.out.println(giftCard-=25);
        }else if(item.equals("pillow")){
            System.out.println(giftCard-=400);
        }else{
           isValid = false;
        }


        if(isValid && giftCard >0){
            System.out.println("Thank you for your purchase!");
        }else if (isValid && giftCard<0){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else{
            System.out.println("Invalid item!");
        }
    }
}
