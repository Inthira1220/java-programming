package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
//    getIntegerList
//    return List<Integer>
//    Loop from 0-1_000_000
//    and add to arrayList

        //1second  = 1_000_000_000 =  nanoSecond
        long start = System.nanoTime();
        System.out.println("getIntegerList = "+ getIntegerList());
        long end = System.nanoTime();
        System.out.println("end-start = " + (end-start));


        //in store to variable
        List<Integer>mlnNums = getIntegerList();
        long arrStart = System.nanoTime();
        int[]arr = getIntegerArray();
        long arrEnd = System.nanoTime();
        System.out.println("end-start = " + (arrEnd-arrStart));
    }

    public static List<Integer> getIntegerList() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 1_000_000; i++) {
            nums.add(i);

        }
        return nums;

    }
    /**
     * getIntegerArray
     * No params
     * return int[]
     *    Loop from 0 - 1000_000
     *    and add to int[] then return it
     */
    public static int[] getIntegerArray(){
        //declare empty array with size-1_000_000
        int[] nums = new int[1_000_001];
        for (int i = 0; i < 1_000_000; i++) {
            nums[i] = i;

        }
        return nums;

    }
}
