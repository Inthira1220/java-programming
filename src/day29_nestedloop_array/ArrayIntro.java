package day29_nestedloop_array;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] nums = new int[3]; //decoration of array
        //int nums[] = new int[3]; [] can be any side of variable name
        nums[0] = 5;
        nums[1] = 10;
        nums[2]= 7;
        // nums[3]= 100; //ArrayIndexOutOfBoundsException
        String text = "";

        System.out.println("Value at index 0 = "+nums[0]);  // index 5
        System.out.println("Value at index 0 = "+nums[1]);  // index 10
        System.out.println("Value at index 0 = "+nums[2]);  // index7

        //we can also use int variable to specify index number
        int i = 0;
        System.out.println(nums[i]); //5
        i++;
        System.out.println(nums[i]);//10

        //how to find out the size of the array.
        System.out.println("number of elements = " + nums.length);
        //store length of array into len variable
        int len = nums.length;
        System.out.println("len = " + len);

        // change values i the array:
        nums[0] = 100;
        nums[1] = 300;
        nums[2] = nums[1]; //read the value of index 1 and assign same to index 2

        System.out.println("nums[0] = "+ nums[0]);
        System.out.println("nums[1] = "+ nums[1]);
        System.out.println("nums[2] = "+ nums[2]);

//        for (int i = 0; i < nums.length; i++) {
//            text += nums[i]+", ";
//        }
//        System.out.println(text.substring(0, text.length()-2));
    }
}
