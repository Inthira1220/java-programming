package day29_nestedloop_array;

public class times2 {
    public static void main(String[] args) {
/**
 * 0:1
 * 0:2
 * 0:59
 * 1:0
 * 1:1
 * 1:2
 * ..
 */
        for (int minutes = 1; minutes <= 4; minutes++) {
            for (int seconds = 0; seconds <= 59; seconds++) {
                System.out.println(minutes + " : " + seconds);

            }
        }
    }
}
