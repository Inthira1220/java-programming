package day20_string_mainpulation;

public class StringReplace {
    public static void main(String[] args) {
        String sentence = "java strings are fun";
        System.out.println("sentence : "+sentence);

        System.out.println(sentence.replace("a", "u"));
        System.out.println(sentence.replace("strings", "conditions"));
        System.out.println(sentence.replace("Strings", "conditions"));
        System.out.println(sentence.replace("java ",""));
        System.out.println(sentence.replace("java strings are fun"," "));
    }
}
