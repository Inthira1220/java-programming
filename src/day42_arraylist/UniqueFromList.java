package day42_arraylist;

import java.util.*;

public class  UniqueFromList {
    public static void main(String[] args) {
        //declare Integer arrayList with following numbers
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6));
        System.out.println(nums);
        List<Integer> uniqueList = new ArrayList<>();
        // loop through the list
        for (int each : nums) {

            if (Collections.frequency(nums, each) == 1) {
                System.out.print(each + " ");
                uniqueList.add(each);

            }
        }
        System.out.println("\nuniqueList = "+uniqueList);
//        List<Integer> uniqueList = new ArrayList<>();
//        uniqueList.add();


        //@Murodil If we write long complex codes, we can simply separate them into
        // methods and even can use them in different classes to organize better right?
    }

    public static List<Integer> getUniqueIntegers(List<Integer> nums) {
        //new arraylist to store only unique numbers
        List<Integer> uniqueList = new ArrayList<>();
        //loop through the list
        for(int num : nums) {
            //check if number appears only ONCE in the list
            if(Collections.frequency(nums, num) == 1) {
                //print that number
                System.out.print(num +" ");
                uniqueList.add(num);
            }
        }
        return uniqueList;
    }

}
