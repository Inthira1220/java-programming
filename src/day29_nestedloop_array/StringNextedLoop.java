package day29_nestedloop_array;

public class StringNextedLoop {
    public static void main(String[] args) {
        String word = "java";
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));

            }
            System.out.println();
        }
        for (int i = 0; i<word.length(); i++) {
            //for (int j = word.length()-1; j >=i; j--) { // line 15 print out the same as line 14
                for (int j = i; j < word.length(); j++) {
                System.out.print(word.charAt(j));

            }
            System.out.println();

        }
    }
}
