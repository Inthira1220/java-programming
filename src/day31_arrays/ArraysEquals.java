package day31_arrays;

import java.util.*;

public class ArraysEquals {
    public static void main(String[] args) {
        int[] nums1 = {4, 12, 53};
        int[] nums2 = {4, 12, 53};
        if( Arrays.equals(nums1, nums2)){
            System.out.println(true);

        }else{
            System.out.println(false);
        }
    }
}
