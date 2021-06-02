package day40_arrayList;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        System.out.println("nums = " + nums);
        System.out.println("nums size = " + nums.size());
        nums.add(34); nums.add(44); nums.add(88);
        nums.add(500); nums.add(5); nums.add(845); nums.add(0);
        nums.add(500); nums.add(5); nums.add(845); nums.add(0);

        System.out.println("nums = " + nums);
        nums.remove(0); // (1) remove index
        System.out.println("nums = " + nums);
        //nums.remove(88); // index 88 IndexOutOfBoundsException, we have to wrap it 1st
        nums.remove(new Integer(88)); //java will remove number 88 from wrap
        System.out.println("nums = " + nums);
        nums.remove(new Integer(5));
        System.out.println("nums = " + nums); // 5 will remove from the 1st 5 if you want to remove all use loop
        //for loop
        for (int i = 0; i < nums.size(); i++) {

            System.out.println("nums after loop = "+i+" - " +
                    ""+ nums.get(i)+ " ");
        }
        //for each loop and we can do each unbox too
        for (int each : nums) {
            System.out.print(each+ ", ");

        }
    }
}
