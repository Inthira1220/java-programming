package day21_string_mipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.indexOf("g"));
        System.out.println(word.indexOf("u"));//4
        System.out.println(word.indexOf("h"));
        System.out.println(word.indexOf("hub"));//3
        System.out.println(word.indexOf("java"));//-1 <===it cannot find
        System.out.println(word.indexOf(0));//-1

    }
}
