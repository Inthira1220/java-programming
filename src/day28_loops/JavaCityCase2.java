package day28_loops;

public class JavaCityCase2 {
    public static void main(String[] args) {
        int totalCase = 0;

        for (int i = 1; i <= 30; i++) {
            if (i % 7 == 0) {
                totalCase += 500;
            } else {
                totalCase = totalCase + 200; //totalCase+= 200;


            }
            System.out.println("Day " + i + " | total case  : " + totalCase);
        }
        System.out.println("Java City 11/2021 Total Case = "+totalCase);
    }
}
