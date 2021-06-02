package day40_arrayList;
import java.util.*;
public class ArrayListMethod {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("shoppingList.size() = " + shoppingList.size());
        System.out.println("shoppingList.isEmpty() = " + shoppingList.isEmpty());
        //check is empty
        if (shoppingList.isEmpty()){ //isEmpty is Method
            System.out.println("shoppingList = " + shoppingList);
        }else{
            System.out.println("false = " + false);
        }

        shoppingList.add("Shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("Java book");
        shoppingList.add("Tesla");

        System.out.println("shoppingList = " + shoppingList);
        if (shoppingList.isEmpty()){ //isEmpty is Method
            System.out.println("shoppingList = " + shoppingList);
        }else{
            System.out.println("List is not empty, code java then go to the mall");
        }
        int count = shoppingList.size();
        System.out.println("count \'itemToBuy =" +count);
        System.out.println("shoppingList.contains(\"shoes\") = " + shoppingList.contains("Shoes")); //true, case sensitive

        if (shoppingList.contains("Shoes")){
            System.out.println("Shoes is in the List");
        }else{
            System.out.println("Shoes is not in the list");
        }

        System.out.println("Buying shoes ...$80");
        shoppingList.remove("Shoes");
        System.out.println(shoppingList);

        System.out.println("done shopping and go back to coding");
        shoppingList.clear();
        System.out.println("shopping list done = "+shoppingList);

    }
    
    
}
