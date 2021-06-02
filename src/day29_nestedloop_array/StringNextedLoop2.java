package day29_nestedloop_array;

public class StringNextedLoop2 {
    public static void main(String[] args) {


//        1) find duplicates and count
//        2) find unique characters(appearing only once)
//        3) print character and number of occurrences
        String word = "hello world";
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }

    }
}
