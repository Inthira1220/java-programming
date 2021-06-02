package day33_arrays;

import java.util.*;

public class ReserveArray2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("temp = " + temp);

        System.out.println();
        int[] nums = {5, 10, 4, 100};
        System.out.println("before swap: " + Arrays.toString(nums));
        temp = nums[0];
        nums[0] = nums[3];
        nums[3] = temp;
        System.out.println("nums after swap: " + Arrays.toString(nums));
        System.out.println();

        int[] nums2 = {5, 10, 4, 100};
        System.out.println("Before: " + Arrays.toString(nums2));
        for (int i = 0; i < nums2.length / 2; i++) { // -->/2, loop until half way
            int temp2 = nums2[i];                     //Because if you dont divide it by /2, you will reverse it
            nums2[i] = nums2[nums2.length - 1 - i];   // backwards and after you hit middle of array it will
            nums2[nums2.length - 1 - i] = temp2;    // reverse it back to normal again

        }
        System.out.println("after: " + Arrays.toString(nums2));
        System.out.println();

        String[] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("before reverse words = " + Arrays.toString(words));

        for (int i = 0, j = words.length - 1; i < words.length / 2; i++, j--) {
            String tempWord = words[i];
            words[i] = words[j];

        }
        System.out.println("words after reverse = "+Arrays.toString(words));
    }
}
