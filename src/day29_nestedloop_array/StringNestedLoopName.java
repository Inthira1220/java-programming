package day29_nestedloop_array;

public class StringNestedLoopName {
    public static void main(String[] args) {

        String word = "inthira";
        for (int i = 0; i < word.length(); i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));

            }
            System.out.println();
        }
        for (int i = 0; i < word.length(); i++) {

            for (int j = i; j < word.length(); j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }

    }
}
