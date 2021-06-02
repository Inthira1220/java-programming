package day28_loops;

public class BreakVSContinue {
    public static void main(String[] args) {
        // break statement
        for (int i = 1; i <= 5; i++) {

            System.out.print(i + " ");
            if (i == 3) {
                break;
            }
        }
        System.out.println("");
        for (int n = 1; n <= 5; n++) {
            //if (n % 2== 0){
            if (n == 2 || n == 4) {

                continue; // <---goto next iteration, skip the code below
            }
            System.out.print(n); //<--- out of the loops
        }
    }
}