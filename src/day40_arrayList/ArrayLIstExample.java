package day40_arrayList;
import java.util.ArrayList;
//import java.util.List;
//import java.util.*;
public class ArrayLIstExample {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
        System.out.println("Size = "+nums.size());

        //reading from Arraylist
        System.out.println("index 0 = "+nums.get(0));
        System.out.println("index 0 = "+nums.get(1));
        System.out.println("index 0 = "+nums.get(2));
        //System.out.println("index 0 = "+nums.get(5)); //IndexOutOfBoundsException

        //print all values in the same line
        System.out.println("nums = " + nums);

        //remove some number off
        nums.remove(1);
        System.out.println("nums = " + nums);



    }
}
