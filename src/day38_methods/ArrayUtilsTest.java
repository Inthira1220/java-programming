package day38_methods;

import java.util.Arrays;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 9};
        ArrayUtils.printArray(num);
        ArrayUtils.printArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});

        System.out.println("sum Array = " + ArrayUtils.sums(num));
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(Arrays.toString(nums1) + "sum Array = " + ArrayUtils.sums(nums1));

        int[] nums2 = {4, 1, 5, 8};
        System.out.println("ArrayUtils.contains(nums2, 5) "+ArrayUtils.contains(nums2, 5));
        System.out.println(ArrayUtils.contains(num, 5));
        System.out.println(ArrayUtils.contains(nums1, 15));

        System.out.println("check 2 array are equals size "+ArrayUtils.isArrmatching(nums2, nums1));
    }
}
