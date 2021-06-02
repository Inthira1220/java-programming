package day38_methods;

public class ArrayUtils {


    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int sums(int[] nums) {
        int sums = 0;
        for (int i = 0; i < nums.length; i++) {

            sums += nums[i];
        }
        return sums;
    }

    public static boolean contains(int[] nums, int num) {
        boolean found = false;
        for (int each:nums
             ) {
            if(each == num){
                found = true;
                break;
            }
        }
        return found;
    }
    public static boolean isArrmatching(int nums[], int nums1[]){
        if (nums.equals(nums1)){
            return true;
        }
        return false;
    }
}
