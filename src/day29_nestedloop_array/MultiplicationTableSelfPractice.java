package day29_nestedloop_array;

public class MultiplicationTableSelfPractice {
    public static void main(String[] args) {

        for (int outer = 1; outer <= 5; outer++) {
            //System.out.println(i);
            for (int inner = 1; inner <= 5; inner++) {
                int total = outer * inner;


                System.out.print(outer+ " * " + inner +  " = " + total+ "\t");
            }
            System.out.println("");
        }
    }
}
// for (int outer = 1; outer <= 10; outer++) {
//         for (int inner = 1; inner <= 10; inner++) {
//         int total = outer*inner;
//         System.out.print(outer+ " * " + inner +  " = " + total+ "\t");
//
//         }
//         System.out.println("");