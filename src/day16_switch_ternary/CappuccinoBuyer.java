package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "tall";
        double price = 0;
        double calories = 0;

        switch (size) {
            case "tall":
                price = 3.69;
                calories = 90;
                System.out.println("Tall Cappuccino please");
                break;
            case "grande":
                price = 3.99;
                calories = 120;
                System.out.println("Grande Cappuccino please");
                break;
            case "venti":
                price = 4.29;
                calories = 150;
                System.out.println("Venti Cappuccino please");
                break;
            default:
                System.out.println("We don't serve that "+size+ " of Cappuccino");
                break;
        }
        System.out.println("Total price: $" + price);

        System.out.println("You will consume " + calories + " cal of energy.");

    }

}


/*
Add new class CappuccinoBuyer
main method

declare
price    ->
calories ->
size could be "tall", "grade" ,"venti"

when size = "tall"
    print "Tall Cappuccino please"
    price    ->  3.69
    calories ->  90

when size = "grade"
    print "Grande Cappuccino please"
    price    ->  3.99
    calories ->  120

when size = "venti"
    print "Venti Cappuccino please"
    price    ->  4.29
    calories ->  150

any other size:
    print "We do'nt serve that size of Cappuccino"


print "Total price: $3.69"
      "You will consume 90 cal of energy"

 */