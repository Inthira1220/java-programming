package day31_arrays;

import java.util.Arrays;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {5, 1, 7, 0, 6, 8, 8, 10};
        Arrays.sort(nums);
        System.out.print(Arrays.toString(nums)); //[0, 1, 5, 6, 7, 8, 8, 10]
        System.out.println();
        System.out.print(Arrays.toString(nums).replace(", ", " / ")); //[0 / 1 / 5 / 6 / 7 / 8 / 8 / 10]
        System.out.println();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums)); //[0, 1, 5, 6, 7, 8, 8, 10]
        System.out.println("min value: " + nums[0]); //min value: 0
        System.out.println("max value: " + nums[nums.length-1]); //max value: 10

    }
}

