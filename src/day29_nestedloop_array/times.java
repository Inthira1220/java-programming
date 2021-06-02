package day29_nestedloop_array;

public class times {
    public static void main(String[] args) {


        for (int minutes = 1; minutes <= 5; minutes++) {
            System.out.println("\nminutes : "+minutes);
            for (int seconds = 0; seconds <= 60; seconds++) {
                System.out.print(seconds+ " ");

            }
        }
    }

}