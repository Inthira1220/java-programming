package day23_string_manipulation_while_loop;

public class TrimNReplaceSpace {
    public static void main(String[] args) {
        String word = " java ";
        System.out.println(word.trim());

        word  = " s q l ";
        System.out.println(word.trim());
        word = word.trim();
        System.out.println("from line 10 new input in variable = "+word);
        word = word.replace(" ", "");
        System.out.println("word = " + word);
    }
}
