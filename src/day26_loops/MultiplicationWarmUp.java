package day26_loops;

public class MultiplicationWarmUp {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            int total = num * i;
            //System.out.println(num + " x " + i + " = " + total);
            for(int j = 1; j<=5; j++) {
                System.out.print(j + " x " + i + " = " + (i * j) + "\t");
            }
            System.out.println(" ");
        }
    }
}
