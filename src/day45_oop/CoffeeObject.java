package day45_oop;

public class CoffeeObject {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("myCoffee.getAmount() = " + myCoffee.getAmount());

        myCoffee.refill();
        System.out.println("myCoffee after refill = " + myCoffee.getAmount());

        myCoffee.drink(10);
        System.out.println("amount after drink 10 = " + myCoffee.getAmount());
        
        myCoffee.setType("Turkish Coffee");
        System.out.println("myCoffee.getType() = " + myCoffee.getType());


        //describe myCoffee - show all variable values
        System.out.println(myCoffee.toString());


        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1.getType() = " + coffee1.getType());

        //assign coffee1 object to coffee
        Coffee coffee2 = coffee1;
        System.out.println("coffee2 = " + coffee2.getType());
        coffee2.setType("espresso");
        System.out.println("coffee2 = " + coffee2.getType());

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappucino");
        coffee3 = coffee2;
        System.out.println("coffee3 = " + coffee3.getType());

        Coffee coffee4 = null; //reference variable doesnt
        coffee4.setType("turkish"); //NullPointException
    }
}
