package day15_logicallops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {

        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "Wooden Spoon";
        String itemName2 = "apples";
        if (onSale && freeShipping) {
            System.out.println("Adding to the cart -" + itemName);
        } else {
            System.out.println("Continue shopping for good deals on- " + itemName);
        }
        if (onSale && freeShipping && itemName2.equals("apples")) {

        } else {
            System.out.println("Continue shopping for good deals on- " + itemName);
        }

    }

}
