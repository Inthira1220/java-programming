package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(1,2,3,4,5);
        addNumbers(1, 8, 0);
        addNumbers(1, 8);
        addNumbers(18);
    }

    public static void addNumbers(int... nums) {
        int sum = 0;
        for (int n : nums
        ) {
            sum += n;
        }
        System.out.println("sum = " + sum);
    }


}
