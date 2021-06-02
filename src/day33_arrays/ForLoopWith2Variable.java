package day33_arrays;

//import java.util.*;

public class ForLoopWith2Variable {
    public static void main(String[] args) {
        for (int i = 1, j = 1; i <= 4; i++, j++) {
            System.out.println("i = " + i + ", j = " + j);

        }
        System.out.println("--------2 way for loop-------");
        for (int i = 1, j = 5; j >= 1; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
//could you please tell us when will we need to use this method at work?
// when you wanna change the index of two different array at the same time
// with || both variables had to hit exit condition limits, with && one of variables has to hit exit condition limit
    }
}
