package day31_arrays;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {23, 123, 654, 2344, 12345, 144421};

//        System.out.println(Arrays.binarySearch(nums, 23)); // 0
//        System.out.println(Arrays.binarySearch(nums, 2344)); //3
//        System.out.println(Arrays.binarySearch(nums, 40)); // -2
//        System.out.println(Arrays.binarySearch(nums, 300)); //-3
//        System.out.println(Arrays.binarySearch(nums, 144421)); //5
//        System.out.println(Arrays.binarySearch(nums, 25)); //-2
//        System.out.println(Arrays.binarySearch(nums, -25)); //-1

        //check if number 12345 is among numbers is array
        if (Arrays.binarySearch(nums, 12345) >= 0) {
            System.out.println("12345 is present in Array");
        }else{
            System.out.println("12345 is not present");
        }
//        String numsStr = Arrays.toString(nums);
//        System.out.println(numsStr.contains("1234")); try to run this code
        }
    }
