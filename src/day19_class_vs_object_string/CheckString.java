package day19_class_vs_object_string;

public class CheckString {
    public static void main(String[] args) {
        String word ="Java";
        String uWord = word.toUpperCase();
        System.out.println(word);
        System.out.println(uWord);

        if(word.equals(uWord)){
            System.out.println("word = uWord");

        }else{
            System.out.println("word != uWord");
        }
    }
}